package com.google.example.games.basegameutils;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.AdSize;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.e;
import com.google.android.gms.games.f;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.plus.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;

public class a implements c, d {
    public static final String[] a = new String[]{"UNCONFIGURED", "DISCONNECTED", "CONNECTING", "CONNECTED"};
    int b = 0;
    boolean c = false;
    Activity d = null;
    String[] e;
    com.google.android.gms.games.c f = null;
    b g = null;
    com.google.android.gms.a.a h = null;
    int i = 0;
    int j = 0;
    int k = 0;
    boolean l = true;
    boolean m = false;
    com.google.android.gms.common.a n = null;
    c o = null;
    boolean p = false;
    String q = "GameHelper";
    String r;
    b s = null;

    public a(Activity activity) {
        this.d = activity;
    }

    static String b(int i) {
        switch (i) {
            case AdSize.FULL_WIDTH /*-1*/:
                return "RESULT_OK";
            case e.MapAttrs_mapType /*0*/:
                return "RESULT_CANCELED";
            case 10001:
                return "RESULT_RECONNECT_REQUIRED";
            case 10002:
                return "SIGN_IN_FAILED";
            case 10003:
                return "RESULT_LICENSE_FAILED";
            case 10004:
                return "RESULT_APP_MISCONFIGURED";
            case 10005:
                return "RESULT_LEFT_ROOM";
            default:
                return String.valueOf(i);
        }
    }

    static String c(int i) {
        switch (i) {
            case e.MapAttrs_mapType /*0*/:
                return "SUCCESS(" + i + ")";
            case e.MapAttrs_cameraBearing /*1*/:
                return "SERVICE_MISSING(" + i + ")";
            case e.MapAttrs_cameraTargetLat /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED(" + i + ")";
            case e.MapAttrs_cameraTargetLng /*3*/:
                return "SERVICE_DISABLED(" + i + ")";
            case e.MapAttrs_cameraTilt /*4*/:
                return "SIGN_IN_REQUIRED(" + i + ")";
            case e.MapAttrs_cameraZoom /*5*/:
                return "INVALID_ACCOUNT(" + i + ")";
            case e.MapAttrs_uiCompass /*6*/:
                return "RESOLUTION_REQUIRED(" + i + ")";
            case e.MapAttrs_uiRotateGestures /*7*/:
                return "NETWORK_ERROR(" + i + ")";
            case e.MapAttrs_uiScrollGestures /*8*/:
                return "INTERNAL_ERROR(" + i + ")";
            case e.MapAttrs_uiTiltGestures /*9*/:
                return "SERVICE_INVALID(" + i + ")";
            case e.MapAttrs_uiZoomControls /*10*/:
                return "DEVELOPER_ERROR(" + i + ")";
            case e.MapAttrs_uiZoomGestures /*11*/:
                return "LICENSE_CHECK_FAILED(" + i + ")";
            default:
                return "Unknown error code " + i;
        }
    }

    public void a() {
        c("onDisconnected.");
        if (this.b == 1) {
            c("onDisconnected is expected, so no action taken.");
            return;
        }
        d("Unexpectedly disconnected. Severing remaining connections.");
        e();
        this.o = null;
        c("Making extraordinary call to onSignInFailed callback");
        a(false);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i) {
        String str = a[this.b];
        String str2 = a[i];
        this.b = i;
        c("State change " + str + " -> " + str2);
    }

    public void a(int i, int i2, Intent intent) {
        c("onActivityResult: req=" + (i == 9001 ? "RC_RESOLVE" : String.valueOf(i)) + ", resp=" + b(i2));
        if (i != 9001) {
            c("onActivityResult: request code not meant for us. Ignoring.");
            return;
        }
        this.c = false;
        if (this.b != 2) {
            c("onActivityResult: ignoring because state isn't STATE_CONNECTING (it's " + a[this.b] + ")");
        } else if (i2 == -1) {
            c("onAR: Resolution was RESULT_OK, so connecting current client again.");
            j();
        } else if (i2 == 10001) {
            c("onAR: Resolution was RECONNECT_REQUIRED, so reconnecting.");
            j();
        } else if (i2 == 0) {
            c("onAR: Got a cancellation result, so disconnecting.");
            this.l = false;
            this.m = false;
            this.o = null;
            e();
            a(false);
        } else {
            c("onAR: responseCode=" + b(i2) + ", so giving up.");
            a(new c(this.n.b(), i2));
        }
    }

    public void a(Activity activity) {
        this.d = activity;
        c("onStart, state = " + a[this.b]);
        a("onStart");
        switch (this.b) {
            case e.MapAttrs_cameraBearing /*1*/:
                if (this.l) {
                    c("onStart: Now connecting clients.");
                    h();
                    return;
                }
                c("onStart: Not connecting (user specifically signed out).");
                return;
            case e.MapAttrs_cameraTargetLat /*2*/:
                c("onStart: connection process in progress, no action taken.");
                return;
            case e.MapAttrs_cameraTargetLng /*3*/:
                c("onStart: already connected (unusual, but ok).");
                return;
            default:
                String str = "onStart: BUG: unexpected state " + a[this.b];
                e(str);
                throw new IllegalStateException(str);
        }
    }

    public void a(Bundle bundle) {
        c("onConnected: connected! client=" + this.k);
        this.j |= this.k;
        c("Connected clients updated to: " + this.j);
        if (this.k == 1 && bundle != null) {
            c("onConnected: connection hint provided. Checking for invite.");
            Invitation invitation = (Invitation) bundle.getParcelable("invitation");
            if (!(invitation == null || invitation.c() == null)) {
                c("onConnected: connection hint has a room invite!");
                this.r = invitation.c();
                c("Invitation ID: " + this.r);
            }
            c("onConnected: connection hint provided. Checking for TBMP game.");
        }
        i();
    }

    public void a(com.google.android.gms.common.a aVar) {
        c("onConnectionFailed");
        this.n = aVar;
        c("Connection failure:");
        c("   - code: " + c(this.n.b()));
        c("   - resolvable: " + this.n.a());
        c("   - details: " + this.n.toString());
        if (this.m) {
            c("onConnectionFailed: since user initiated sign-in, resolving problem.");
            l();
            return;
        }
        c("onConnectionFailed: since user didn't initiate sign-in, failing now.");
        this.n = aVar;
        a(1);
        a(false);
    }

    public void a(b bVar, int i, String... strArr) {
        int i2 = 0;
        if (this.b != 0) {
            String str = "GameHelper: you called GameHelper.setup() twice. You can only call it once.";
            e(str);
            throw new IllegalStateException(str);
        }
        this.s = bVar;
        this.i = i;
        c("Setup: requested clients: " + this.i);
        Vector vector = new Vector();
        if ((i & 1) != 0) {
            vector.add("https://www.googleapis.com/auth/games");
        }
        if ((i & 2) != 0) {
            vector.add("https://www.googleapis.com/auth/plus.login");
        }
        if ((i & 4) != 0) {
            vector.add("https://www.googleapis.com/auth/appstate");
        }
        if (strArr != null) {
            for (Object add : strArr) {
                vector.add(add);
            }
        }
        this.e = new String[vector.size()];
        vector.copyInto(this.e);
        c("setup: scopes:");
        String[] strArr2 = this.e;
        int length = strArr2.length;
        while (i2 < length) {
            c("  - " + strArr2[i2]);
            i2++;
        }
        if ((i & 1) != 0) {
            c("setup: creating GamesClient");
            this.f = new f(g(), this, this).a(49).a(this.e).a();
        }
        if ((i & 2) != 0) {
            c("setup: creating GamesPlusClient");
            this.g = new com.google.android.gms.plus.c(g(), this, this).a(this.e).a();
        }
        if ((i & 4) != 0) {
            c("setup: creating AppStateClient");
            this.h = new com.google.android.gms.a.c(g(), this, this).a(this.e).a();
        }
        a(1);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(c cVar) {
        a(1002, "giveUp", "giveUp should only be called when connecting. Proceeding anyway.", 2);
        this.l = false;
        e();
        this.o = cVar;
        m();
        a(false);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str) {
        if (this.b == 0) {
            String str2 = "GameHelper error: Operation attempted without setup: " + str + ". The setup() method must be called before attempting any other operation.";
            e(str2);
            throw new IllegalStateException(str2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(StringBuilder stringBuilder, byte b) {
        int b2;
        if (b2 < (byte) 0) {
            b2 = b2 + 256;
        }
        int i = b2 / 16;
        int i2 = b2 % 16;
        stringBuilder.append("0123456789ABCDEF".substring(i, i + 1));
        stringBuilder.append("0123456789ABCDEF".substring(i2, i2 + 1));
    }

    /* Access modifiers changed, original: 0000 */
    public void a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("Notifying LISTENER of sign-in ");
        String str = z ? "SUCCESS" : this.o != null ? "FAILURE (error)" : "FAILURE (no error)";
        c(stringBuilder.append(str).toString());
        if (this.s == null) {
            return;
        }
        if (z) {
            this.s.k();
        } else {
            this.s.j();
        }
    }

    public void a(boolean z, String str) {
        this.p = z;
        this.q = str;
        if (z) {
            c("Debug log enabled, tag: " + str);
        }
    }

    /* Access modifiers changed, original: varargs */
    public boolean a(int i, String str, String str2, int... iArr) {
        for (int i2 : iArr) {
            if (this.b == i2) {
                return true;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (i == 1001) {
            stringBuilder.append("GameHelper: you attempted an operation at an invalid. ");
        } else {
            stringBuilder.append("GameHelper: bug detected. Please report it at our bug tracker ");
            stringBuilder.append("https://github.com/playgameservices/android-samples/issues. ");
            stringBuilder.append("Please include the last couple hundred lines of logcat output ");
            stringBuilder.append("and describe the operation that caused this. ");
        }
        stringBuilder.append("Explanation: ").append(str2);
        stringBuilder.append("Operation: ").append(str).append(". ");
        stringBuilder.append("State: ").append(a[this.b]).append(". ");
        if (iArr.length == 1) {
            stringBuilder.append("Expected state: ").append(a[iArr[0]]).append(".");
        } else {
            stringBuilder.append("Expected states:");
            for (int i22 : iArr) {
                stringBuilder.append(" ").append(a[i22]);
            }
            stringBuilder.append(".");
        }
        d(stringBuilder.toString());
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public Dialog b(String str) {
        return new Builder(g()).setMessage(str).setNeutralButton(17039370, null).create();
    }

    public com.google.android.gms.games.c b() {
        if (this.f != null) {
            return this.f;
        }
        throw new IllegalStateException("No GamesClient. Did you request it at setup?");
    }

    /* Access modifiers changed, original: 0000 */
    public void c(String str) {
        if (this.p) {
            Log.d(this.q, "GameHelper: " + str);
        }
    }

    public boolean c() {
        return this.b == 3;
    }

    public void d() {
        c("onStop, state = " + a[this.b]);
        a("onStop");
        switch (this.b) {
            case e.MapAttrs_cameraBearing /*1*/:
                c("onStop: not connected, so no action taken.");
                break;
            case e.MapAttrs_cameraTargetLat /*2*/:
            case e.MapAttrs_cameraTargetLng /*3*/:
                c("onStop: Killing connections");
                e();
                break;
            default:
                String str = "onStop: BUG: unexpected state " + a[this.b];
                e(str);
                throw new IllegalStateException(str);
        }
        this.d = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void d(String str) {
        Log.w(this.q, "!!! GameHelper WARNING: " + str);
    }

    /* Access modifiers changed, original: 0000 */
    public void e() {
        if (a(1002, "killConnections", "killConnections() should only get called while connected or connecting.", 3, 2)) {
            c("killConnections: killing connections.");
            this.n = null;
            this.o = null;
            if (this.f != null && this.f.b()) {
                c("Disconnecting GamesClient.");
                this.f.c();
            }
            if (this.g != null && this.g.b()) {
                c("Disconnecting PlusClient.");
                this.g.c();
            }
            if (this.h != null && this.h.b()) {
                c("Disconnecting AppStateClient.");
                this.h.c();
            }
            this.j = 0;
            c("killConnections: all clients disconnected.");
            a(1);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void e(String str) {
        Log.e(this.q, "*** GameHelper ERROR: " + str);
    }

    public void f() {
        if (this.b == 3) {
            d("beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success.");
            a(true);
        } else if (this.b == 2) {
            d("beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it's clicked, and re-enable when you get the callback.");
        } else {
            c("Starting USER-INITIATED sign-in flow.");
            this.l = true;
            int a = com.google.android.gms.common.f.a(g());
            c("isGooglePlayServicesAvailable returned " + a);
            if (a != 0) {
                c("Google Play services not available. Show error dialog.");
                this.o = new c(a, 0);
                m();
                a(false);
                return;
            }
            this.m = true;
            if (this.n != null) {
                c("beginUserInitiatedSignIn: continuing pending sign-in flow.");
                a(2);
                l();
                return;
            }
            c("beginUserInitiatedSignIn: starting new sign-in flow.");
            h();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Context g() {
        return this.d;
    }

    /* Access modifiers changed, original: 0000 */
    public void h() {
        if (a(1002, "startConnections", "startConnections should only get called when disconnected.", 1)) {
            c("Starting connections.");
            a(2);
            this.r = null;
            i();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void i() {
        c("connectNextClient: requested clients: " + this.i + ", connected clients: " + this.j);
        if (this.f != null && this.f.b() && (this.j & 1) == 0) {
            d("GamesClient was already connected. Fixing.");
            this.j |= 1;
        }
        if (this.g != null && this.g.b() && (this.j & 2) == 0) {
            d("PlusClient was already connected. Fixing.");
            this.j |= 2;
        }
        if (this.h != null && this.h.b() && (this.j & 4) == 0) {
            d("AppStateClient was already connected. Fixing");
            this.j |= 4;
        }
        int i = this.i & (this.j ^ -1);
        c("Pending clients: " + i);
        if (i == 0) {
            c("All clients now connected. Sign-in successful!");
            k();
            return;
        }
        if (this.f != null && (i & 1) != 0) {
            c("Connecting GamesClient.");
            this.k = 1;
        } else if (this.g != null && (i & 2) != 0) {
            c("Connecting PlusClient.");
            this.k = 2;
        } else if (this.h == null || (i & 4) == 0) {
            throw new AssertionError("Not all clients connected, yet no one is next. R=" + this.i + ", C=" + this.j);
        } else {
            c("Connecting AppStateClient.");
            this.k = 4;
        }
        j();
    }

    /* Access modifiers changed, original: 0000 */
    public void j() {
        if (this.b == 1) {
            d("GameHelper got disconnected during connection process. Aborting.");
            return;
        }
        if (a(1002, "connectCurrentClient", "connectCurrentClient should only get called when connecting.", 2)) {
            switch (this.k) {
                case e.MapAttrs_cameraBearing /*1*/:
                    this.f.a();
                    return;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    this.g.a();
                    return;
                case e.MapAttrs_cameraTilt /*4*/:
                    this.h.a();
                    return;
                default:
                    return;
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void k() {
        a(1002, "succeedSignIn", "succeedSignIn should only get called in the connecting or connected state. Proceeding anyway.", 2, 3);
        c("All requested clients connected. Sign-in succeeded!");
        a(3);
        this.o = null;
        this.l = true;
        this.m = false;
        a(true);
    }

    /* Access modifiers changed, original: 0000 */
    public void l() {
        a(1002, "resolveConnectionResult", "resolveConnectionResult should only be called when connecting. Proceeding anyway.", 2);
        if (this.c) {
            c("We're already expecting the result of a previous resolution.");
            return;
        }
        c("resolveConnectionResult: trying to resolve result: " + this.n);
        if (this.n.a()) {
            c("Result has resolution. Starting it.");
            try {
                this.c = true;
                this.n.a(this.d, 9001);
                return;
            } catch (SendIntentException e) {
                c("SendIntentException, so connecting again.");
                j();
                return;
            }
        }
        c("resolveConnectionResult: result has no resolution. Giving up.");
        a(new c(this.n.b()));
    }

    /* Access modifiers changed, original: 0000 */
    public void m() {
        Context g = g();
        if (g == null) {
            c("*** No context. Can't show failure dialog.");
            return;
        }
        Dialog b;
        c("Making error dialog for failure: " + this.o);
        int a = this.o.a();
        switch (this.o.b()) {
            case 10002:
                b = b(g.getString(e.gamehelper_sign_in_failed));
                break;
            case 10003:
                b = b(g.getString(e.gamehelper_license_failed));
                break;
            case 10004:
                b = b(g.getString(e.gamehelper_app_misconfigured));
                n();
                break;
            default:
                b = com.google.android.gms.common.f.a(a, this.d, 9002, null);
                if (b == null) {
                    c("No standard error dialog available. Making fallback dialog.");
                    b = b(g.getString(e.gamehelper_unknown_error) + " " + c(a));
                    break;
                }
                break;
        }
        c("Showing error dialog.");
        b.show();
    }

    /* Access modifiers changed, original: 0000 */
    public void n() {
        c("****");
        c("****");
        c("**** APP NOT CORRECTLY CONFIGURED TO USE GOOGLE PLAY GAME SERVICES");
        c("**** This is usually caused by one of these reasons:");
        c("**** (1) Your package name and certificate fingerprint do not match");
        c("****     the client ID you registered in Developer Console.");
        c("**** (2) Your App ID was incorrectly entered.");
        c("**** (3) Your game settings have not been published and you are ");
        c("****     trying to log in with an account that is not listed as");
        c("****     a test account.");
        c("****");
        if (g() == null) {
            c("*** (no Context, so can't print more debug info)");
            return;
        }
        c("**** To help you debug, here is the information about this app");
        c("**** Package name         : " + g().getPackageName());
        c("**** Cert SHA1 fingerprint: " + p());
        c("**** App ID from          : " + o());
        c("****");
        c("**** Check that the above information matches your setup in ");
        c("**** Developer Console. Also, check that you're logging in with the");
        c("**** right account (it should be listed in the Testers section if");
        c("**** your project is not yet published).");
        c("****");
        c("**** For more information, refer to the troubleshooting guide:");
        c("****   http://developers.google.com/games/services/android/troubleshooting");
    }

    /* Access modifiers changed, original: 0000 */
    public String o() {
        try {
            Resources resources = g().getResources();
            return resources.getString(resources.getIdentifier("app_id", "string", g().getPackageName()));
        } catch (Exception e) {
            e.printStackTrace();
            return "??? (failed to retrieve APP ID)";
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String p() {
        try {
            Signature[] signatureArr = g().getPackageManager().getPackageInfo(g().getPackageName(), 64).signatures;
            if (signatureArr.length == 0) {
                return "ERROR: NO SIGNATURE.";
            }
            if (signatureArr.length > 1) {
                return "ERROR: MULTIPLE SIGNATURES";
            }
            byte[] digest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                if (i > 0) {
                    stringBuilder.append(":");
                }
                a(stringBuilder, digest[i]);
            }
            return stringBuilder.toString();
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return "(ERROR: package not found)";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "(ERROR: SHA1 algorithm not found)";
        }
    }
}
