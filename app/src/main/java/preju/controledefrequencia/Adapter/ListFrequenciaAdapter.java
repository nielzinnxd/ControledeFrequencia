package preju.controledefrequencia.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

import preju.controledefrequencia.LayoutStrings;
import preju.controledefrequencia.R;


public class ListFrequenciaAdapter extends ArrayAdapter<LayoutStrings> {
    DecimalFormat df = new DecimalFormat("0.00");
    private int layoutResource;

    public ListFrequenciaAdapter(Context context, int layoutResource, List<LayoutStrings> layoutStringsList) {
        super(context, layoutResource, layoutStringsList);
        this.layoutResource = layoutResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(layoutResource, null);
        }

        LayoutStrings layoutStrings = getItem(position);

        if (layoutStrings != null) {
            ProgressBar prog = (ProgressBar) view.findViewById(R.id.progressBar);
            ProgressBar progAux = (ProgressBar) view.findViewById(R.id.progressBar2);
            TextView quin = (TextView) view.findViewById(R.id.quinID);
            TextView status = (TextView) view.findViewById(R.id.tv_status);
            TextView porc = (TextView) view.findViewById(R.id.tv_porcento);
            TextView hr = (TextView) view.findViewById(R.id.tv_hrs);

            if (quin != null) {
                quin.setText(layoutStrings.getQuinzena());
            }
            if (prog != null) {
                int myInt;
                if (layoutStrings.getProgressbar() > 100) {
                    myInt = (int) (layoutStrings.getProgressbar() - 100)+1;
                    prog.setVisibility(View.GONE);

                    progAux.setVisibility(View.VISIBLE);
                    progAux.setProgress(100 - myInt);
                    progAux.setSecondaryProgress(myInt);
                } else {
                    prog.setVisibility(View.VISIBLE);
                    prog.setProgress((int) layoutStrings.getProgressbar());
                    progAux.setVisibility(View.GONE);
                }
            }
            if (status != null) {
                status.setText(layoutStrings.getStatus());
            }
            if (porc != null) {
                df = new DecimalFormat("0.00");
                String str = df.format((layoutStrings.getProgressbar() - 100.0));

                if(layoutStrings.getProgressbar() > 100) {
                    porc.setText("100% + " + str +"%");
                }else{
                    porc.setText(layoutStrings.getPorcento());
                }
            }
            if (hr != null) {
                hr.setText(layoutStrings.getHrs());
            }
        }

        return view;
    }
}