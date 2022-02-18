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
import com.example.movieapp.model.Genre

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class GenreAdapter(
    val genresList: List<Genre> = DataSource.genres )

    class GenreViewHolder(view: View?) {
        //Declare and initialize all of the list item UI components
        val genreImageView: ImageView? = view?.findViewById(R.id.genre_image)
        val genreNameText: TextView? = view?.findViewById(R.id.genre_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        //Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.
        val adaptorLayout = when (layout) {
            Layout.GRID -> LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item,parent,false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item,parent,false)
        }

        //Null should not be passed into the view holder. This should be updated to reflect
        //the inflated layout.
        return DogCardViewHolder(adaptorLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        // Setup custom accessibility delegate to set the text read
        layout.accessibilityDelegate = Accessibility
        return LetterViewHolder(layout)
}



