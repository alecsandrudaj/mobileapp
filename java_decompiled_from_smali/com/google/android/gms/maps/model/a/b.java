package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.e;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public abstract class b extends Binder implements a {
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new c(iBinder) : (a) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        float d;
        boolean z;
        boolean g;
        switch (i) {
            case e.MapAttrs_cameraBearing /*1*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a();
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTargetLat /*2*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case e.MapAttrs_cameraTargetLng /*3*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a((List) parcel.createTypedArrayList(LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_cameraTilt /*4*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                List c = c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            case e.MapAttrs_cameraZoom /*5*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiCompass /*6*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                d = d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case e.MapAttrs_uiRotateGestures /*7*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiScrollGestures /*8*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                i3 = e();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case e.MapAttrs_uiTiltGestures /*9*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_uiZoomControls /*10*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                d = f();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case e.MapAttrs_uiZoomGestures /*11*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case e.MapAttrs_useViewLifecycle /*12*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = g();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case e.MapAttrs_zOrderOnTop /*13*/:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(z);
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = h();
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                g = a(a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (g) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                i3 = i();
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
