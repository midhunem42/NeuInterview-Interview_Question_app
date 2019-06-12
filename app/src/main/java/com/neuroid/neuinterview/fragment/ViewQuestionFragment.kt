package com.neuroid.neuinterview.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.neuroid.neuinterview.R
import com.neuroid.neuinterview.Utility.AppDBOpenHelper
import com.neuroid.neuinterview.model.Question

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ViewQuestionFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ViewQuestionFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ViewQuestionFragment : Fragment() {

    var currentQid:Int = 0
    var questions : ArrayList<Question>? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_view_questions, container, false)

        val name = arguments?.getString("category")
        val qId = arguments!!.getInt("qId")

        val dbHandler= AppDBOpenHelper(activity!!,null)
            questions = dbHandler.getQuestionsByCategory(name as String)
        dbHandler.close()

        currentQid = qId
        setData(view)

        val backBtn = view.findViewById<Button>(R.id.btnViewBack)
        val nextBtn = view.findViewById<ImageButton>(R.id.btnNxtView)
        val prevBtn = view.findViewById<ImageButton>(R.id.btnPrevView)


        backBtn.setOnClickListener {
            val fragment = QuestionsFragment.newInstance(name)
            replaceFragments(fragment)
        }

        nextBtn.setOnClickListener {
            currentQid += 1
            setData(view)
        }
        prevBtn.setOnClickListener {
            currentQid -= 1
            setData(view)
        }
        return view
    }


    companion object {
        fun newInstance(name: String,qId:Int): ViewQuestionFragment {
            val args = Bundle()
            args.putString("category", name)
            args.putInt("qId",qId)
            val fragment = ViewQuestionFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private fun replaceFragments(fragment:Fragment) {
        activity!!.supportFragmentManager.beginTransaction().replace(R.id.relativelayout, fragment).commit()
    }

    private fun setData(view:View){
        val tv = view.findViewById<TextView>(R.id.viewQuestion)
        val tvQuestion = view.findViewById<TextView>(R.id.tvQuestion)
        val tvAnswer = view.findViewById<TextView>(R.id.tvAnswer)
        val nextBtn = view.findViewById<ImageButton>(R.id.btnNxtView)
        val prevBtn = view.findViewById<ImageButton>(R.id.btnPrevView)


        nextBtn.isClickable = questions!!.size-1 != currentQid
        prevBtn.isClickable = currentQid != 0

        if(questions!!.size-1 == currentQid){
            nextBtn.setBackgroundResource(R.drawable.arrow_right_disabled)
        }else{
            nextBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_right_black_24dp)
        }
        if(currentQid == 0){
            prevBtn.setBackgroundResource(R.drawable.arrow_left_disabled)
        }else{
            prevBtn.setBackgroundResource(R.drawable.arrow_left)
        }

        val textQ= "Question "
        tv.text = textQ.plus(currentQid + 1)
        tvQuestion.text = questions!!.get(currentQid).question
        tvAnswer.text = questions!!.get(currentQid).answer

    }
}