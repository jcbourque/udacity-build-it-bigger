package com.example.android.comedyclub;

import android.content.Context;
import android.content.Intent;

public final class ComedyClubIntent extends Intent {
    static final String JOKE = "joke";

    public ComedyClubIntent(Context context, String joke) {
        super(context, StageActivity.class);
        this.putExtra(JOKE, joke);
    }}
