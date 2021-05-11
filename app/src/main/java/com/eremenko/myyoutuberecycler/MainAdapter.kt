package com.eremenko.myyoutuberecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.video_row.view.*

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder>() {

    val videoTitles = listOf("First title", "Second", "3rd", "moore titles")

    //number of items
    override fun getItemCount(): Int {
        //return 4 //количество роликов
       // return videoTitles.size
        return homeFeed.videos.count()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        //how do we even create a view
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)


    }


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
      //  val videoTitle = videoTitles.get(position)

        val video = homeFeed.videos.get(position)

        holder?.view?.textView_video_title?.text = video.name //название роликов
    }

}
class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {


}
