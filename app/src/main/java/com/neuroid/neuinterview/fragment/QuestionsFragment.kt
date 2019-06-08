package com.neuroid.neuinterview.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.neuroid.neuinterview.R
import com.neuroid.neuinterview.Utility.AppDBOpenHelper
import com.neuroid.neuinterview.Utility.OnItemClickListener
import com.neuroid.neuinterview.Utility.adapter.QuestionAdapter
import com.neuroid.neuinterview.model.Question

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [QuestionsFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [QuestionsFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */

class QuestionsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    var questions:ArrayList<Question> =ArrayList()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_questions, container, false)
        // Inflate the layout for this fragment
        val name = arguments!!.getString("category")

        val dbHandler= AppDBOpenHelper(activity!!,null);
             questions = dbHandler.getQuestionsByCategory(name)!!
        dbHandler.close()

        val recyclerview = view.findViewById<RecyclerView>(R.id.recyclerQuestions)

        val listener = object : OnItemClickListener {
            override fun onItemClick(position: Int) {
                val fragment = ViewQuestionFragment.newInstance(name,position)
                replaceFragments(fragment)
            }
        }

        recyclerview.layoutManager =LinearLayoutManager(activity!!)
        recyclerview.adapter = QuestionAdapter(questions,activity!!,listener)
        return view
    }

    companion object {
        fun newInstance(name: String): QuestionsFragment {
            val args = Bundle()
            args.putString("category", name)
            val fragment = QuestionsFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private fun replaceFragments(fragment:Fragment) {
       activity!!.supportFragmentManager.beginTransaction().replace(R.id.relativelayout, fragment).commit()
    }

}