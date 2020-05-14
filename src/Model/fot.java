
package Model;

/**
 *
 * @author aurore
 */
public enum fot {
    id(1),
    name(2);
    private Integer gn;

    private fot(Integer gn) {
        this.gn = gn;
    }

    public Integer getGn() {
        return gn;
    }
   
}
