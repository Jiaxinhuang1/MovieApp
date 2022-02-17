import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.R
import com.example.movieapp.const.Layout
import com.example.movieapp.data.DataSource

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class GenreAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<GenreAdapter.GenreCardViewHolder>() {

    //Initialize the data using the List found in data/DataSource
    val movieList = DataSource.movies

    /**
     * Initialize view elements
     */
    class GenreCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        //Declare and initialize all of the list item UI components
        val genreImageView : ImageView? = view?.findViewById(R.id.genre_image)
        val genreNameText : TextView? = view?.findViewById(R.id.genre_name)
    }

    class MovieCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        //Declare and initialize all of the list item UI components
        val movieImageView : ImageView? = view?.findViewById(R.id.movie_image)
        val movieNameText : TextView? = view?.findViewById(R.id.movie_name)
        val movieGenreText : TextView? = view?.findViewById(R.id.movie_genre)
        val movieActorsText : TextView? = view?.findViewById(R.id.movie_actors)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreCardViewHolder {
        //Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.
        val adaptorLayout = when (layout) {
            Layout.GRID -> LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item,parent,false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.vertical_list_item,parent,false)
        }

        //Null should not be passed into the view holder. This should be updated to reflect
        //the inflated layout.
        return GenreCardViewHolder(adaptorLayout)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }//return the size of the data set instead of 0


    override fun onBindViewHolder(holder: GenreCardViewHolder, position: Int) {
        // Get the data at the current position
        // Set the image resource for the current dog
        // Set the text for the current dog's name
        // Set the text for the current dog's age
        val resources = context?.resources
        val movieData = movieList[position]
        holder.genreImageView?.setImageResource(movieData.imageResourceId)
        holder.genreNameText?.text = movieData.name
        //holder.dogAgeText?.text = resources?.getString(R.string.dog_age, dogData.age)
        //holder.dogHobbyText?.text = resources?.getString(R.string.dog_hobbies, dogData.hobbies)

        // Set the text for the current dog's hobbies by passing the hobbies to the
        //  R.string.dog_hobbies string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_hobbies, dog.hobbies)
    }
}

