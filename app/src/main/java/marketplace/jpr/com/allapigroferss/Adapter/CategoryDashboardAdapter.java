package marketplace.jpr.com.allapigroferss.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import marketplace.jpr.com.allapigroferss.R;
import marketplace.jpr.com.allapigroferss.models.dashboard.BlockbusterSaver;
import marketplace.jpr.com.allapigroferss.models.dashboard.Category;

public class CategoryDashboardAdapter extends RecyclerView.Adapter<CategoryDashboardAdapter.ViewHolder> {
    private List<Category>categoryDashboardAdapter;
    Context context;

    //click listner
    private SellingListInterface sellingListInterface;

    public CategoryDashboardAdapter(Context context) {
        this.context = context;
    }  ////



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())   ////
                .inflate(R.layout.recycler_categorydashboardadapter, viewGroup, false);   ////

        return new CategoryDashboardAdapter.ViewHolder(itemView);
    }

    public void setdata(List<Category> itemList) {
        this.categoryDashboardAdapter = itemList;

    }  ////


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {


        final Category alItems = categoryDashboardAdapter.get(i);
        viewHolder.getCatTitle.setText(alItems.getCatTitle());
        viewHolder.getCatDesc.setText(alItems.getCatDesc());
        viewHolder.getDTitle.setText(alItems.getDTitle());

        Picasso.with(context).load(alItems.getCatImage())
                .error(R.drawable.veg).into(viewHolder.getCatImage);

        //click listner
        viewHolder.getCatImage.setOnClickListener(new View.OnClickListener() {   //
            @Override
            public void onClick(View view) {                                     //
                if (sellingListInterface != null) {                              //
                    sellingListInterface.sellinglistitem(alItems.getCatId());    //
                }                                                                //

            }                                                                    //
        });                                                                      //



    }

    //click listner
    public void setSellingListInterface(SellingListInterface sellingListInterface) {   //
        this.sellingListInterface = sellingListInterface;                             //
    }                                                                                //



    @Override
    public int getItemCount() {
        return categoryDashboardAdapter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView getCatImage;
        private TextView getCatTitle, getCatDesc, getDTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            getCatTitle = itemView.findViewById(R.id.text_tv11);
            getCatDesc= itemView.findViewById(R.id.text_tv11);
            getDTitle = itemView.findViewById(R.id.text_tv11);
            getCatImage= itemView.findViewById(R.id.logoID1);

        }
    }



    //click listner
    public interface SellingListInterface {         //
        public void sellinglistitem(String id);    //
    }                                             //

}
