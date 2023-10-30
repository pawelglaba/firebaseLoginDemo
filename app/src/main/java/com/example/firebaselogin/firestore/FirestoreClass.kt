package com.example.firebaselogin.firestore

import android.util.Log
import com.example.firebaselogin.RegisterActivity
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions

class FirestoreClass {

    private val mFireStore = FirebaseFirestore.getInstance()


    fun registerUserFS(activity: RegisterActivity, userInfo: User){

       mFireStore.collection("users")
           .document(userInfo.id)
           .set(userInfo, SetOptions.merge())
           .addOnSuccessListener {
               activity.userRegistrationSuccess()

           }
           .addOnFailureListener{

           }
    }






}