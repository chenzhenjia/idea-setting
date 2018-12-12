
/*****************************************
 *                                       *
 *  @dookay.com Internet make it happen  *
 *  ----------- -----------------------  *
 *  dddd  ddddd Internet make it happen  *
 *  o   o     o Internet make it happen  *
 *  k    k    k Internet make it happen  *
 *  a   a     a Internet make it happen  *
 *  yyyy  yyyyy Internet make it happen  *
 *  ----------- -----------------------  *
 *  NO BUG ENJOY LIFE                    *
 *                                       *
 ****************************************/

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import com.dookay.coral.common.core.enums.IEnum;

#parse("File Header.java")
@EnumRequire(description = "枚举描述")
public enum ${NAME} implements IEnum{

    TYPE(0,"类型1");
    
    private int value;
    private String description;

    ${NAME}(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static ${NAME} valueOf(Integer value) {
        ${NAME}[] values = ${NAME}.values();
        for (${NAME} item : values) {
            if (item.value == value) {
                return item;
            }
        }
        return null;
    }
}