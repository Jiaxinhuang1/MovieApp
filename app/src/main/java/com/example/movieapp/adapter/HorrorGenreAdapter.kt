import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.MainActivity
import com.example.movieapp.R
import com.example.movieapp.const.Layout
import com.example.movieapp.data.DataSource

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class HorrorGenreAdapter(
    private val context: Context?,
    private val layout: Int,
): RecyclerView.Adapter<HorrorGenreAdapter.MovieCardViewHolder>() {

    //Initialize the data using the List found in data/DataSource
    var main = MainActivity()
    val horrorMovieList = DataSource.HorrorMovieItems
    val SEARCH_PREFIX = "https://www.google.com/search?q="



    /**
     * Initialize view elements
     */
    //class GenreCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        //Declare and initialize all of the list item UI components
        //val genreImageView : ImageView? = view?.findViewById(R.id.genre_image)
        //val genreNameText : TextView? = view?.findViewById(R.id.genre_name)
    //}

    class MovieCardViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        //Declare and initialize all of the list item UI components
        val movieImageView : ImageView? = view?.findViewById(R.id.movie_image)
        val movieNameText : TextView? = view?.findViewById(R.id.movie_name)
        val movieDateText : TextView? = view?.findViewById(R.id.movie_date)
        //val movieGenreText : TextView? = view?.findViewById(R.id.movie_genre)
        //val movieActorsText : TextView? = view?.findViewById(R.id.movie_actors)
        val button = view.findViewById<Button>(R.id.button)
        val watchlistButton = view.findViewById<Button>(R.id.add_watchlist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCardViewHolder {
        //Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.
        val adaptorLayout = when (layout) {
            Layout.VERTICAL -> LayoutInflater.from(parent.context).inflate(R.layout.movie_items,parent,false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.movie_items,parent,false)
        }

        //Null should not be passed into the view holder. This should be updated to reflect
        //the inflated layout.
        return MovieCardViewHolder(adaptorLayout)
    }

    override fun getItemCount(): Int {
//        if (main.GenreString == "ACTION")
//            return actionMovieList.size
//        else
//            return comedyMovieList.size
        return horrorMovieList.size
    }//return the size of the data set instead of 0


    override fun onBindViewHolder(holder: HorrorGenreAdapter.MovieCardViewHolder, position: Int) {
        // Get the data at the current position
        // Set the image resource for the current dog
        // Set the text for the current dog's name
        // Set the text for the current dog's age
        val resources = context?.resources
//        val movieData = when (main.GenreString){
//            "ACTION" -> actionMovieList[position]
//            else -> comedyMovieList[position]
//        }
        val movieData = horrorMovieList[position]
        holder.movieImageView?.setImageResource(movieData.imageResourceId)
        holder.movieNameText?.text = movieData.name
        holder.movieDateText?.text = resources?.getString(R.string.movie_date, movieData.date)
        //holder.dogAgeText?.text = resources?.getString(R.string.dog_age, dogData.age)
        //holder.dogHobbyText?.text = resources?.getString(R.string.dog_hobbies, dogData.hobbies)

        // Set the text for the current dog's hobbies by passing the hobbies to the
        //  R.string.dog_hobbies string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_hobbies, dog.hobbies)
        val context = holder.itemView.context
        val stringSearch = movieData.name
        holder.button.setOnClickListener {
            val queryUrl: Uri = Uri.parse("${SEARCH_PREFIX}${stringSearch}")
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            context.startActivity(intent)
        }
        holder.watchlistButton.setOnClickListener{
            val toast = Toast.makeText(context, "${movieData.name} added to Watchlist", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
            toast.show()
            movieData.inWatchlist = true
        }
    }
    // Setup custom accessibility delegate to set the text read with
    // an accessibility service
    companion object Accessibility : View.AccessibilityDelegate() {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onInitializeAccessibilityNodeInfo(
            host: View?,
            info: AccessibilityNodeInfo?
        ) {
            super.onInitializeAccessibilityNodeInfo(host, info)
            // With `null` as the second argument to [AccessibilityAction], the
            // accessibility service announces "double tap to activate".
            // If a custom string is provided,
            // it announces "double tap to <custom string>".
            val customString = host?.context?.getString(R.string.movie_date)
            val customClick =
                AccessibilityNodeInfo.AccessibilityAction(
                    AccessibilityNodeInfo.ACTION_CLICK,
                    customString
                )
            info?.addAction(customClick)
        }
    }
}


