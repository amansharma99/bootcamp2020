package com.SpringRestFulPart2.SpringRestFulPart2;
//import org.codehaus.jackson.annotate.JsonIgnore;
//import org.apache.htrace.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
        //import org.codehaus.jackson.annotate.JsonIgnore;
        import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
@ApiModel(description = "All Users Information")

@JsonIgnoreProperties(value = "password")
public class User {
    @NotNull
    @ApiModelProperty(notes = "Can not be empty")
    private Integer id;
    @NotNull
    @Length(min = 2)
    @ApiModelProperty(notes = "Atleast 2 characters Required")
    private String name;
    @NotNull
    @Min(value = 18)
    @ApiModelProperty(notes = "Person should be Adult")
    private Integer age;
    @Length(min = 2)
    private String password;

    public User(@NotNull Integer id, @NotNull @Length(min = 2) String name, @NotNull @Min(value = 18) Integer age, @Length(min = 2) String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) {
//        password = password;
//    }
}
