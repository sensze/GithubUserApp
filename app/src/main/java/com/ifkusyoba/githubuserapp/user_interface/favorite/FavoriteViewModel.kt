package com.ifkusyoba.githubuserapp.user_interface.favorite

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.ifkusyoba.githubuserapp.data.local.FavoriteUser
import com.ifkusyoba.githubuserapp.data.local.FavoriteUserDao
import com.ifkusyoba.githubuserapp.data.local.UserDatabase

class FavoriteViewModel(application: Application): AndroidViewModel(application) {
    private var userDao: FavoriteUserDao?
    private var userDb: UserDatabase?

    init{
        userDb = UserDatabase.getDatabase(application)
        userDao = userDb?.favoriteUserDao()
    }
    fun getFavoriteUser(): LiveData<List<FavoriteUser>>?{
        return userDao?.getFavoriteUser()
    }
}