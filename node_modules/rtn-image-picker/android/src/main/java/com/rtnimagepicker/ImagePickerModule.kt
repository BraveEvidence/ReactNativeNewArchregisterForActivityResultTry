package com.rtnimagepicker

import android.content.Intent
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.rtnimagepicker.NativeImagePickerSpec
import com.rnapp.MainActivity

class ImagePickerModule(val context: ReactApplicationContext?) :
    NativeImagePickerSpec(context) {


    override fun getName(): String {
        return NAME
    }

    override fun pickImage(promise: Promise?) {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.addCategory(Intent.CATEGORY_OPENABLE)
        intent.type = "image/*"
        val activity = context?.currentActivity as MainActivity
        activity.resultLauncher.launch(intent)

    }

    companion object {
        const val NAME = "RTNImagePicker"
    }


}