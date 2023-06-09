package com.fifty.learndaggerhilt

import androidx.lifecycle.ViewModel
import com.fifty.learndaggerhilt.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
) : ViewModel() {

}