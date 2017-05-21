package com.mickamy.qiitaviewer.ui.result;

import android.view.View;
import android.widget.TextView;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.mickamy.qiitaviewer.ui.base.BaseEpoxyHolder;
import com.mickamy.qiitaviewer.R;
import com.mickamy.qiitaviewer.util.TextFormatUtils;

import org.threeten.bp.OffsetDateTime;

import butterknife.BindView;

import static com.airbnb.epoxy.EpoxyAttribute.Option.DoNotHash;
import static com.mickamy.qiitaviewer.ui.result.QiitaItemModel.QiitaItemHolder;

@EpoxyModelClass(layout = R.layout.model_qiita_item)
abstract class QiitaItemModel extends EpoxyModelWithHolder<QiitaItemHolder> {

    @EpoxyAttribute
    String title;

    @EpoxyAttribute
    OffsetDateTime createdAt;

    @EpoxyAttribute(DoNotHash)
    View.OnClickListener onClickListener;

    @Override
    public void bind(QiitaItemHolder holder) {
        holder.titleText.setText(title);
        holder.createdAtText.setText(TextFormatUtils.formatDateTime(createdAt));
        holder.itemView.setOnClickListener(onClickListener);
    }

    static class QiitaItemHolder extends BaseEpoxyHolder {

        @BindView(R.id.title_text)
        TextView titleText;
        @BindView(R.id.created_at_text)
        TextView createdAtText;
    }
}
