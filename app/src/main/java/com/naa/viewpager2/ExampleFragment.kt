package com.naa.viewpager2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.naa.viewpager2.databinding.ExamplPageBinding

class ExampleFragment : Fragment(R.layout.exampl_page) {
    private var binding: ExamplPageBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = ExamplPageBinding.bind(view)
        val color = requireArguments().getInt("COLOR")
        binding?.layoutContent?.setBackgroundColor(color)

        val pagerCommunicator = requireActivity() as? PagerCommunicator
        binding?.btnButton?.setOnClickListener {
            pagerCommunicator?.onClick(color)
        }
    }


}