package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RollFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RollFragment : Fragment(R.layout.fragment_roll) {
    private var fragmentView: View? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val R: Button =view.findViewById(com.example.myapplication.R.id.but1)
        val Back:Button=view.findViewById(com.example.myapplication.R.id.Back)
        Back.setOnClickListener{
            requireActivity().supportFragmentManager.popBackStack()
        }
        R.setOnClickListener{
            IceRoll()
        }
    }

    private fun IceRoll() {
        val image: ImageView? = view?.findViewById(R.id.dice_img)
        // Add null check on view and use a nullable ImageView

        if (view == null) {
            Log.d("RollFragment", "view is null")
            return // Exit the method if view is null
        }

        Log.d("RollFragment", "onViewCreated() called successfully")
        val randRolled = Random().nextInt(6) + 1
        val RolledImage = when (randRolled) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        image?.setImageResource(RolledImage)


    }
    }

