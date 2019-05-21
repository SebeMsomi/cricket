package za.ac.cput.Cricket.domain.members;

import java.util.Objects;

public class ThirdEmpire {
    private String role;

    private ThirdEmpire(){}

    private ThirdEmpire (Builder builder) {
        this.role = builder.role;
    }

    public String getRole() {
        return role;
    }

    public static class Builder{
        private String role;

        public Builder role(String role) {
            this.role = role;
            return this;
        }
        public ThirdEmpire build() {
            return new ThirdEmpire(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThirdEmpire that = (ThirdEmpire) o;
        return role.equals(that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }

    @Override
    public String toString() {
        return "ThirdEmpire{" +
                "role='" + role + '\'' +
                '}';
    }
}
