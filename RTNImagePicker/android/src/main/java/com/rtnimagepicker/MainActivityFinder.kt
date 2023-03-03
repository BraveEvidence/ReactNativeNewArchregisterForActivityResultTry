package com.rtnimagepicker

import android.content.Context
import android.content.Intent

interface MainActivityFinder {
    fun homeScreenIntent(context: Context): Intent
}