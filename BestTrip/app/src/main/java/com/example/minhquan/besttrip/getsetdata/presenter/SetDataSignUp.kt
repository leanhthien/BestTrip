package com.example.minhquan.besttrip.getsetdata.presenter

import android.widget.EditText
import com.example.minhquan.besttrip.model.firebasedata.User
import com.google.firebase.database.FirebaseDatabase

class SetDataSignUp {
    fun createNewUserFireBase(edtEmail: EditText,edtFullName: EditText,edtPassWord: EditText,edtPhoneNumber: EditText){
        val database = FirebaseDatabase.getInstance().reference

        val user = User(edtEmail.text.toString(),null,null,edtFullName.text.toString(),
                edtPassWord.text.toString(),edtPhoneNumber.text.toString(),"http://perritoshc.mx/media/k2/items/cache/e37cb185c8f2dc5dd52ce2fc045570ec_M.jpg")
        database.child("Client").child(edtFullName.text.toString()).setValue(user)
    }
}