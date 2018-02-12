package com.lego.myspinnerapplication

import android.content.Context
import android.graphics.Paint
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.spinner_dropdown_element.view.*
import kotlinx.android.synthetic.main.spinner_element.view.*


class LanguageAdapter(context: Context, resource: Int, array: Array<String>, private val width: Int):
        ArrayAdapter<String>(context, resource, array) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = super.getView(position, convertView, parent)
        view.textView.paintFlags = view.textView.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = super.getDropDownView(position, convertView, parent)

        view.minimumWidth = width
        return view
    }

}