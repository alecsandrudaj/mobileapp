package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.ads.AdSize;
import com.google.android.gms.e;
import java.util.ArrayList;
import java.util.List;

public abstract class bb extends Binder implements ba {
    public static ba a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ba)) ? new bc(iBinder) : (ba) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        Uri uri = null;
        aq a;
        int readInt;
        String readString;
        String readString2;
        aq a2;
        switch (i) {
            case e.MapAttrs_cameraBearing /*1*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLat /*2*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLng /*3*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                b(ar.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTilt /*4*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(parcel.readInt() != 0 ? ak.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraZoom /*5*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                String a3 = a();
                parcel2.writeNoException();
                parcel2.writeString(a3);
                return true;
            case e.MapAttrs_uiCompass /*6*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                b();
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiRotateGestures /*7*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                c(ar.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiScrollGestures /*8*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiTiltGestures /*9*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiZoomControls /*10*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                d(ar.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiZoomGestures /*11*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_useViewLifecycle /*12*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_zOrderOnTop /*13*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                b(ar.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a = ar.a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                a(a, readInt, readString, uri, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                e(ar.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                c(ar.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a = ar.a(parcel.readStrongBinder());
                readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a, readString2, z);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                aq a4 = ar.a(parcel.readStrongBinder());
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a4, z2, z);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readString(), (List) parcel.createStringArrayList(), (List) parcel.createStringArrayList(), (List) parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                f(ar.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 25:
                bv a5;
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a2 = ar.a(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    a5 = bv.CREATOR.createFromParcel(parcel);
                }
                a(a2, readString3, a5);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                g(ar.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a = ar.a(parcel.readStrongBinder());
                readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a, readString2, z, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readString(), (List) parcel.createTypedArrayList(x.CREATOR));
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a = ar.a(parcel.readStrongBinder());
                readString2 = parcel.readString();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(x.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a, readString2, (List) createTypedArrayList, z);
                parcel2.writeNoException();
                return true;
            case 30:
                co a6;
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a2 = ar.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    a6 = co.CREATOR.createFromParcel(parcel);
                }
                a(a2, a6);
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readString(), (List) parcel.createTypedArrayList(x.CREATOR), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case AdSize.LANDSCAPE_AD_HEIGHT /*32*/:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a = ar.a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                a(a, readInt, readString, uri, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                h(ar.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), (List) parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                i(ar.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 36:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 38:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                d(ar.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                a(ar.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.plus.internal.IPlusService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
