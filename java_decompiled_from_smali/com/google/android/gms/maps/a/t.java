package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.e;

public abstract class t extends Binder implements s {
    public static s a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof s)) ? new u(iBinder) : (s) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        boolean z;
        boolean a;
        switch (i) {
            case e.MapAttrs_cameraBearing /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLat /*2*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLng /*3*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTilt /*4*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                d(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraZoom /*5*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                e(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiCompass /*6*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                f(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiRotateGestures /*7*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                g(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiScrollGestures /*8*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                h(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiTiltGestures /*9*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = a();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case e.MapAttrs_uiZoomControls /*10*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = b();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case e.MapAttrs_uiZoomGestures /*11*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = c();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case e.MapAttrs_useViewLifecycle /*12*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = d();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case e.MapAttrs_zOrderOnTop /*13*/:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = e();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = f();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                a = g();
                parcel2.writeNoException();
                if (a) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
