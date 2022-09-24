package com.preyash.emailvalid.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.preyash.emailvalid.repository.GroceryRepository

class GroceryViewModelFactory(private val repository: GroceryRepository):ViewModelProvider.NewInstanceFactory() {

   override fun <T:ViewModel>create(modelClass: Class<T>): T{
       return GroceryViewModel(repository) as T
   }
}