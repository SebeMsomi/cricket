package za.ac.cput.Cricket.domain.members;

public class MainEmpire {
    private String role;

    private MainEmpire(){}

    public String getRole() {
        return role;
    }

    private MainEmpire(Builder builder) {


        this.role = builder.role;

    }
    public static class Builder
    {

        private String role;

        public Builder role(String role){
            this.role = role;
            return this;
        }

        public MainEmpire build(){
            return new MainEmpire(this);
        }
    }

    @Override
    public String toString() {
        return "MainEmpire{" +
                "role='" + role + '\'' +
                '}';
    }
}
