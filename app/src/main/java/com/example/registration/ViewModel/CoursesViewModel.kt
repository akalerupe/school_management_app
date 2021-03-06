package com.example.registration.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.registration.Repository.CoursesRepository
import com.example.registration.Repository.UserRepository
import com.example.registration.models.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel

class CoursesViewModel@Inject constructor(coursesRepository: CoursesRepository):ViewModel() {
    lateinit var coursesLiveData: LiveData<List<Course>>
//    var coursesRepository = CoursesRepository()
    var courseResponseLiveData = MutableLiveData<List<CoursesResponse>>()
    var courseErrorLiveData = MutableLiveData<String>()

    fun displayCoursesList(accessToken: String) {
        viewModelScope.launch {
//            var response = coursesRepository.coursesList(accessToken)
//            if (response.isSuccessful) {
//                courseResponseLiveData.postValue(response.body())
//            } else {
//                courseErrorLiveData.postValue(response.errorBody()?.string())
//            }


        }
//        fun getDbCourses() {
//            coursesLiveData = coursesRepository.getCoursesfromDb()
//        }
    }

}