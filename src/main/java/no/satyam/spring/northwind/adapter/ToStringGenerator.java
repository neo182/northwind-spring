package no.satyam.spring.northwind.adapter;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author srt
 */
public class ToStringGenerator {

    public static String generateInMultiLine(Object object) {
        return ToStringBuilder.reflectionToString(object, ToStringStyle.MULTI_LINE_STYLE);
    }
}
