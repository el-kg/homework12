public class Author {
    private String Name;
    private String surName;

    public Author(String name, String surName) {
        this.Name = name;
        this.surName = surName;

    }

    public String getName() {
        return this.Name;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
