package com.cliffpanos.truepass.Object;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;

public class Guest {

    @NonNull private final String guestName;
    @NonNull private final Bitmap guestImage;
    private final int guestPassDateCreated;

    public Guest(@NonNull String guestName, @NonNull Bitmap guestImage, int guestPassDateCreated) {
        this.guestName = guestName;
        this.guestImage = guestImage;
        this.guestPassDateCreated = guestPassDateCreated;
    }

    @NonNull
    public String getGuestName() {
        return guestName;
    }

    @NonNull
    public Bitmap getGuestImage() {
        return guestImage;
    }

    public int getGuestPassDateCreated() {
        return guestPassDateCreated;
    }
}
