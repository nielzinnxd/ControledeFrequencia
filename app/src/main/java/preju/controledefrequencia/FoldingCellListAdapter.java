package preju.controledefrequencia;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;

        import com.ramotion.foldingcell.FoldingCell;

        import org.w3c.dom.Text;

        import java.util.HashSet;
        import java.util.List;

/**
 * Simple example of ListAdapter for using with Folding Cell
 * Adapter holds indexes of unfolded elements for correct work with default reusable views behavior
 */
public class FoldingCellListAdapter extends ArrayAdapter<Item> {

    private HashSet<Integer> unfoldedIndexes = new HashSet<>();
    private View.OnClickListener defaultRequestBtnClickListener;


    public FoldingCellListAdapter(Context context, List<Item> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get item for selected view
        Item item = getItem(position);
        // if cell is exists - reuse it, if not - create the new one from resource
        FoldingCell cell = (FoldingCell) convertView;
        ViewHolder viewHolder;
        if (cell == null) {
            viewHolder = new ViewHolder();
            LayoutInflater vi = LayoutInflater.from(getContext());
            cell = (FoldingCell) vi.inflate(R.layout.cell, parent, false);
            // binding view parts to view holder
            viewHolder.leftDia = (TextView) cell.findViewById(R.id.tv_left_dia);
            viewHolder.leftTotal = (TextView) cell.findViewById(R.id.tv_left_total);

            viewHolder.centerPrimeiroPeriodoEntrada =  (TextView) cell.findViewById(R.id.tv_center_primeiro_periodo);
            viewHolder.centerPrimeiroPeriodoSaida = (TextView ) cell.findViewById(R.id.tv_center_primeiro_periodo_saida);

            viewHolder.centerSegundoPeriodoEntrada =  (TextView) cell.findViewById(R.id.tv_center_segundo_periodo);
            viewHolder.centerSegundoPeriodoSaida = (TextView) cell.findViewById(R.id.tv_center_segundo_periodo_saida);

            viewHolder.primeiroPeriodoEntrada = (TextView) cell.findViewById(R.id.valor_primeiro_periodo_entrada);
            viewHolder.primeiroPeriodoSaida = (TextView) cell.findViewById(R.id.valor_primeiro_periodo_saida);

            viewHolder.segundoPeriodoEntrada = (TextView) cell.findViewById(R.id.valor_segundo_periodo_entrada);
            viewHolder.segundoPeriodoSaida = (TextView) cell.findViewById(R.id.valor_segundo_periodo_saida);

            viewHolder.terceiroPeriodoEntrada = (TextView) cell.findViewById(R.id.valor_terceiro_periodo_entrada);
            viewHolder.terceiroPeriodoSaida = (TextView) cell.findViewById(R.id.valor_terceiro_periodo_saida);

            viewHolder.quartoPeriodoEntrada = (TextView) cell.findViewById(R.id.valor_quarto_periodo_entrada);
            viewHolder.quartoPeriodoSaida = (TextView) cell.findViewById(R.id.valor_quarto_periodo_saida);

            viewHolder.quintoPeriodoEntrada = (TextView) cell.findViewById(R.id.valor_quinto_periodo_entrada);
            viewHolder.quintoPeriodoSaida = (TextView) cell.findViewById(R.id.valor_quinto_periodo_saida);

            viewHolder.cabecalhoHoraTotal = (TextView) cell.findViewById(R.id.total_horas);
            viewHolder.cabecalhoDia = (TextView) cell.findViewById(R.id.cabecalho_dia);

            viewHolder.observacao = (TextView) cell.findViewById(R.id.tv_observacoes_value);

            viewHolder.contentRequestBtn = (TextView) cell.findViewById(R.id.content_request_btn);
            cell.setTag(viewHolder);
        } else {
            // for existing cell set valid valid state(without animation)
            if (unfoldedIndexes.contains(position)) {
                cell.unfold(true);
            } else {
                cell.fold(true);
            }
            viewHolder = (ViewHolder) cell.getTag();
        }

        viewHolder.primeiroPeriodoEntrada.setText(item.getPrimeiroPeriodoEntrada());
        viewHolder.primeiroPeriodoSaida.setText(item.getPrimeiroPeriodoSaida());

        viewHolder.segundoPeriodoEntrada.setText(item.getSegundoPeriodoEntrada());
        viewHolder.segundoPeriodoSaida.setText(item.getSegundoPeriodoSaida());

        viewHolder.terceiroPeriodoEntrada.setText(item.getTerceiroPeriodoEntrada());
        viewHolder.terceiroPeriodoSaida.setText(item.getTerceiroPeriodoSaida());

        viewHolder.quartoPeriodoEntrada.setText(item.getQuartoPeriodoEntrada());
        viewHolder.quartoPeriodoSaida.setText(item.getQuartoPeriodoSaida());

        viewHolder.quintoPeriodoEntrada.setText(item.getQuintoPeriodoEntrada());
        viewHolder.quintoPeriodoSaida.setText(item.getQuintoPeriodoSaida());

        viewHolder.centerPrimeiroPeriodoEntrada.setText(item.getPrimeiroPeriodoEntrada());
        viewHolder.centerSegundoPeriodoEntrada.setText(item.getSegundoPeriodoEntrada());

        viewHolder.centerPrimeiroPeriodoSaida.setText(item.getPrimeiroPeriodoSaida());
        viewHolder.centerSegundoPeriodoSaida.setText(item.getSegundoPeriodoSaida());

        viewHolder.cabecalhoHoraTotal.setText(item.getTotalHorasDia());
        viewHolder.cabecalhoDia.setText(item.getDia());

        viewHolder.leftDia.setText("Dia " + item.getDia());
        viewHolder.leftTotal.setText(item.getTotalHorasDia());

        viewHolder.observacao.setText(item.getObservacao());


        // set custom btn handler for list item from that item
        if (item.getRequestBtnClickListener() != null) {
            viewHolder.contentRequestBtn.setOnClickListener(item.getRequestBtnClickListener());
        } else {
            // (optionally) add "default" handler if no handler found in item
            viewHolder.contentRequestBtn.setOnClickListener(defaultRequestBtnClickListener);
        }


        return cell;
    }

    // simple methods for register cell state changes
    public void registerToggle(int position) {
        if (unfoldedIndexes.contains(position))
            registerFold(position);
        else
            registerUnfold(position);
    }

    public void registerFold(int position) {
        unfoldedIndexes.remove(position);
    }

    public void registerUnfold(int position) {
        unfoldedIndexes.add(position);
    }

    public View.OnClickListener getDefaultRequestBtnClickListener() {
        return defaultRequestBtnClickListener;
    }

    public void setDefaultRequestBtnClickListener(View.OnClickListener defaultRequestBtnClickListener) {
        this.defaultRequestBtnClickListener = defaultRequestBtnClickListener;
    }

    // View lookup cache
    private static class ViewHolder {


        TextView primeiroPeriodoEntrada;
        TextView primeiroPeriodoSaida;
        TextView segundoPeriodoEntrada;
        TextView segundoPeriodoSaida;
        TextView terceiroPeriodoEntrada;
        TextView terceiroPeriodoSaida;
        TextView quartoPeriodoEntrada;
        TextView quartoPeriodoSaida;
        TextView quintoPeriodoEntrada;
        TextView quintoPeriodoSaida;
        TextView observacao;
        TextView leftDia;
        TextView leftTotal;
        TextView cabecalhoHoraTotal;
        TextView cabecalhoDia;
        TextView total;
        TextView dia;
        TextView centerPrimeiroPeriodoSaida;
        TextView centerSegundoPeriodoSaida;
        TextView centerPrimeiroPeriodoEntrada;
        TextView centerSegundoPeriodoEntrada;
        TextView contentRequestBtn;

    }
}