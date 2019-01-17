package self.he.pojo;

import java.util.Date;

public class Girl {
    private Long id;
    private String name;
    private String flower;
    private Date birthday;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFlower() {
        return flower;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
