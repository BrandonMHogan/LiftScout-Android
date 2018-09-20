package brandonhogan.com.liftscout.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    object _data: MutableLiveData<String>()

    fun data(): MutableLiveData<String> {
        return _data
    }

    init {

    }



//    private val _data = MutableLiveData<String>()
//
//    val data: MutableLiveData<String>
//
//    init {
//        _data.value = "Hello Whatever!"
//    }
}
