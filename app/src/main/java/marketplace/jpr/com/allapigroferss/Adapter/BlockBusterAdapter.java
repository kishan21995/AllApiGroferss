package marketplace.jpr.com.allapigroferss.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
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
import marketplace.jpr.com.allapigroferss.models.dashboard.BlockbusterSaver;

public class BlockBusterAdapter extends RecyclerView.Adapter<BlockBusterAdapter.ViewHolder> {
    private List<BlockbusterSaver>blockBusterAdapter;
    Context context;
    public BlockBusterAdapter(Context context) {
        this.context = context;
    }  ////



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())   ////
                .inflate(R.layout.recycler_blockbastersale, viewGroup, false);   ////

        return new ViewHolder(itemView);  ////
    }


    public void setdata(List<BlockbusterSaver> itemList) {
        this.blockBusterAdapter = itemList;

    }  ////

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {


        BlockbusterSaver alItems = blockBusterAdapter.get(i);
        viewHolder.itemName1.setText(alItems.getPTitle());
        viewHolder.itemWeight1.setText(alItems.getPQuantity());
        viewHolder.totalMoney1.setText(alItems.getPPrice());
        viewHolder.discountMoney1.setText(alItems.getPDiscPrice());

        Picasso.with(context).load(alItems.getPImage())
                .error(R.drawable.veg).into(viewHolder.itemImage1);

    }

    @Override
    public int getItemCount() {
        return blockBusterAdapter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private Button  moneyOff1;
        private ElegantNumberButton elegantNumberButton;
        private ImageView itemImage1, lock1;
        private TextView itemName1, itemWeight1, totalMoney1, discountMoney1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            elegantNumberButton =  itemView.findViewById(R.id.mybutton);
            moneyOff1 = (Button) itemView.findViewById(R.id.moneyOff_btn1);
            itemImage1 = (ImageView) itemView.findViewById(R.id.vegitable_image1);
            lock1 = (ImageView) itemView.findViewById(R.id.lockIMG1);
            itemName1 = (TextView) itemView.findViewById(R.id.itemname1);
            itemWeight1 = (TextView) itemView.findViewById(R.id.quantity1);
            totalMoney1 = (TextView) itemView.findViewById(R.id.totalmoney1);
            discountMoney1 = (TextView) itemView.findViewById(R.id.discountmoney1);

        }
    }
}
