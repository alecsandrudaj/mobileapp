package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.d;

public abstract class af extends Binder implements ad {
    public static ad a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ad)) ? new ag(iBinder) : (ad) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Uri uri = null;
        boolean z = false;
        String a;
        Bundle b;
        d f;
        y a2;
        int readInt;
        boolean z2;
        String readString;
        IBinder readStrongBinder;
        int a3;
        String readString2;
        int readInt2;
        int readInt3;
        int readInt4;
        y a4;
        String readString3;
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a = a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b = b();
                parcel2.writeNoException();
                if (b != null) {
                    parcel2.writeInt(1);
                    b.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (parcel.readInt() != 0) {
                    b = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(readStrongBinder2, b);
                parcel2.writeNoException();
                return true;
            case 5006:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c();
                parcel2.writeNoException();
                return true;
            case 5007:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a = d();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 5008:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5009:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5010:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5011:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0, parcel.createLongArray());
                parcel2.writeNoException();
                return true;
            case 5012:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a = e();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 5013:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f = f();
                parcel2.writeNoException();
                if (f != null) {
                    parcel2.writeInt(1);
                    f.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 5014:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5015:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a2, readInt, z2, z);
                parcel2.writeNoException();
                return true;
            case 5016:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5017:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5018:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5019:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5020:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5021:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    b = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(a2, b, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5022:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5023:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (parcel.readInt() != 0) {
                    b = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                a(a2, readString, readStrongBinder, b);
                parcel2.writeNoException();
                return true;
            case 5024:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (parcel.readInt() != 0) {
                    b = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                b(a2, readString, readStrongBinder, b);
                parcel2.writeNoException();
                return true;
            case 5025:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5026:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                d(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5027:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5028:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5029:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5030:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readStrongBinder(), parcel.readInt(), parcel.createStringArray(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5031:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5032:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                e(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5033:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a3 = a(aa.a(parcel.readStrongBinder()), parcel.createByteArray(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a3);
                return true;
            case 5034:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a3 = a(parcel.createByteArray(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeInt(a3);
                return true;
            case 5035:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 5036:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5037:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5038:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5039:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                readString = parcel.readString();
                readString2 = parcel.readString();
                readInt2 = parcel.readInt();
                readInt3 = parcel.readInt();
                readInt4 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a2, readString, readString2, readInt2, readInt3, readInt4, z);
                parcel2.writeNoException();
                return true;
            case 5040:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                readString = parcel.readString();
                readString2 = parcel.readString();
                readInt2 = parcel.readInt();
                readInt3 = parcel.readInt();
                readInt4 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(a2, readString, readString2, readInt2, readInt3, readInt4, z);
                parcel2.writeNoException();
                return true;
            case 5041:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5042:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5043:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                h(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5044:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5045:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5046:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(a2, readInt, z2, z);
                parcel2.writeNoException();
                return true;
            case 5047:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5048:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(a2, readInt, z2, z);
                parcel2.writeNoException();
                return true;
            case 5049:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                g(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5050:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5051:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5052:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5053:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a3 = j(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a3);
                return true;
            case 5054:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a4 = aa.a(parcel.readStrongBinder());
                readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a4, readString3, z);
                parcel2.writeNoException();
                return true;
            case 5055:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                c(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5056:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                h(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5057:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                l(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5058:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(aa.a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5059:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5060:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a3 = d(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a3);
                return true;
            case 5061:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                k(aa.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5062:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                i(aa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5063:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a4 = aa.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a4, z);
                parcel2.writeNoException();
                return true;
            case 5064:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 5065:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5066:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                uri = e(parcel.readString());
                parcel2.writeNoException();
                if (uri != null) {
                    parcel2.writeInt(1);
                    uri.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 5067:
                int i3;
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                z2 = g();
                parcel2.writeNoException();
                if (z2) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case 5068:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(z);
                parcel2.writeNoException();
                return true;
            case 5501:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5502:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                f = h();
                parcel2.writeNoException();
                if (f != null) {
                    parcel2.writeInt(1);
                    f.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 6001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a4 = aa.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(a4, z);
                parcel2.writeNoException();
                return true;
            case 6002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a4 = aa.a(parcel.readStrongBinder());
                readString3 = parcel.readString();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a4, readString3, readString, z);
                parcel2.writeNoException();
                return true;
            case 6003:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                d(a2, readInt, z2, z);
                parcel2.writeNoException();
                return true;
            case 6004:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                readInt = parcel.readInt();
                z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                e(a2, readInt, z2, z);
                parcel2.writeNoException();
                return true;
            case 6501:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a2 = aa.a(parcel.readStrongBinder());
                readString = parcel.readString();
                int readInt5 = parcel.readInt();
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                a(a2, readString, readInt5, z3, z4, z5, z);
                parcel2.writeNoException();
                return true;
            case 6502:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a4 = aa.a(parcel.readStrongBinder());
                readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(a4, readString3, z);
                parcel2.writeNoException();
                return true;
            case 6503:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a4 = aa.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(a4, z);
                parcel2.writeNoException();
                return true;
            case 6504:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a4 = aa.a(parcel.readStrongBinder());
                readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                c(a4, readString3, z);
                parcel2.writeNoException();
                return true;
            case 6505:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a4 = aa.a(parcel.readStrongBinder());
                readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                d(a4, readString3, z);
                parcel2.writeNoException();
                return true;
            case 6506:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                a4 = aa.a(parcel.readStrongBinder());
                readString3 = parcel.readString();
                readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                b(a4, readString3, readString, z);
                parcel2.writeNoException();
                return true;
            case 6507:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                if (parcel.readInt() != 0) {
                    uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                ParcelFileDescriptor a5 = a(uri);
                parcel2.writeNoException();
                if (a5 != null) {
                    parcel2.writeInt(1);
                    a5.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.games.internal.IGamesService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
