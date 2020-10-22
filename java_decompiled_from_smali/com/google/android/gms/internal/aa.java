package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

public abstract class aa extends Binder implements y {
    public aa() {
        attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
    }

    public static y a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof y)) ? new ac(iBinder) : (y) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        d dVar = null;
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                a(dVar);
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                b(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                b(dVar);
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d a = parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                a(a, dVar);
                parcel2.writeNoException();
                return true;
            case 5006:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                c(dVar);
                parcel2.writeNoException();
                return true;
            case 5007:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                d(dVar);
                parcel2.writeNoException();
                return true;
            case 5008:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                e(dVar);
                parcel2.writeNoException();
                return true;
            case 5009:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                f(dVar);
                parcel2.writeNoException();
                return true;
            case 5010:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                g(dVar);
                parcel2.writeNoException();
                return true;
            case 5011:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                h(dVar);
                parcel2.writeNoException();
                return true;
            case 5012:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                k(dVar);
                parcel2.writeNoException();
                return true;
            case 5013:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5014:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                l(dVar);
                parcel2.writeNoException();
                return true;
            case 5015:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5016:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a();
                parcel2.writeNoException();
                return true;
            case 5017:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                i(dVar);
                parcel2.writeNoException();
                return true;
            case 5018:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                m(dVar);
                parcel2.writeNoException();
                return true;
            case 5019:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                n(dVar);
                parcel2.writeNoException();
                return true;
            case 5020:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                c(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5021:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                o(dVar);
                parcel2.writeNoException();
                return true;
            case 5022:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                p(dVar);
                parcel2.writeNoException();
                return true;
            case 5023:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                q(dVar);
                parcel2.writeNoException();
                return true;
            case 5024:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                r(dVar);
                parcel2.writeNoException();
                return true;
            case 5025:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                s(dVar);
                parcel2.writeNoException();
                return true;
            case 5026:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                a(dVar, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5027:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                b(dVar, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5028:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                c(dVar, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5029:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                d(dVar, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5030:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                e(dVar, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5031:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                f(dVar, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5032:
                RealTimeMessage realTimeMessage;
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    realTimeMessage = (RealTimeMessage) RealTimeMessage.CREATOR.createFromParcel(parcel);
                }
                a(realTimeMessage);
                parcel2.writeNoException();
                return true;
            case 5033:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5034:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5035:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                u(dVar);
                parcel2.writeNoException();
                return true;
            case 5036:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                c(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5037:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                j(dVar);
                parcel2.writeNoException();
                return true;
            case 5038:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                t(dVar);
                parcel2.writeNoException();
                return true;
            case 5039:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0) {
                    dVar = d.CREATOR.createFromParcel(parcel);
                }
                v(dVar);
                parcel2.writeNoException();
                return true;
            case 5040:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
