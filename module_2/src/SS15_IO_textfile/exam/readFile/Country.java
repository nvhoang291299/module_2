package SS15_IO_textfile.exam.readFile;

public class Country {
    private String id;
    private String nameCountry;
    private String codeCountry;
    public Country(){};

    public Country(String id, String nameCountry, String codeCountry) {
        this.id = id;
        this.codeCountry = codeCountry;
        this.nameCountry = nameCountry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", codeCountry='" + codeCountry + '\'' +
                ", nameCountry='" + nameCountry + '\'' +
                '}';
    }
}
