package structure.composite;

/**
 * @author zhyyy 2019/11/8
 **/
public class Staff implements OrganizationComponent {
    private String name;

    public Staff(String name) {
        this.name = name;
    }

    @Override
    public void name() {
        System.out.println("职员" + name + "到场。");
    }
}
