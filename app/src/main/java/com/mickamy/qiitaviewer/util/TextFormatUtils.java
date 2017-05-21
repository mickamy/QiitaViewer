package com.mickamy.qiitaviewer.util;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

public final class TextFormatUtils {

    public static String formatDateTime(OffsetDateTime offsetDateTime) {
        return offsetDateTime.format(DateTimeFormatter.ofPattern("M/d k:m"));
    }
}
