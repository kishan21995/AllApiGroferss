package marketplace.jpr.com.allapigroferss.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.squareup.picasso.Picasso;

import java.util.List;

import marketplace.jpr.com.allapigroferss.R;
import marketplace.jpr.com.allapigroferss.models.dashboard.BestSelling;

public class BestSellingAdapter extends RecyclerView.Adapter<BestSellingAdapter.ViewHolder> {
    private List<BestSelling>bestSellingAdapter;


    private CardView cardView;
    Context context;   ////
    public BestSellingAdapter(Context context) {
        this.context = context;
    }  ////


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext())   ////
                .inflate(R.layout.recycler_bestselling, viewGroup, false);   ////

        return new ViewHolder(itemView);  ////


    }


    public void setdata(List<BestSelling> itemList) {
        this.bestSellingAdapter = itemList;
    }  ////


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {


        BestSelling allItems = bestSellingAdapter.get(i);  ////
        viewHolder.itemName.setText(allItems.getPTitle());  ////
        viewHolder.itemWeight.setText(allItems.getPQuantity());  ////
        viewHolder.totalMoney.setText(allItems.getPPrice());   ////
        viewHolder.discountMoney.setText(allItems.getPDiscPrice()); ////

        Picasso.with(context).load(allItems.getPImage())  ////
                .error(R.drawable.veg).into(viewHolder.itemImage);  ////



    }

    @Override
    public int getItemCount() {
        return bestSellingAdapter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ElegantNumberButton elegantNumberButton;
        private Button addCart, moneyOff;
        private ImageView itemImage, lock;
        private TextView itemName, itemWeight, totalMoney, discountMoney;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            elegantNumberButton =  itemView.findViewById(R.id.addcartbutton);
            moneyOff =  itemView.findViewById(R.id.moneyOff_btn);
            itemImage =  itemView.findViewById(R.id.item_image);
            lock =  itemView.findViewById(R.id.lockIMG);
            itemName =  itemView.findViewById(R.id.item_name);
            itemWeight =  itemView.findViewById(R.id.item_weight);
            totalMoney =  itemView.findViewById(R.id.totalitemmoney);
            discountMoney =  itemView.findViewById(R.id.afterdiscount);




        }
    }
}
