package com.tejas.litho.ui.Fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tejas.litho.R
import com.tejas.litho.ui.ViewModels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment:Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()
}