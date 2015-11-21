package com.synergygb.panama.democda.models.db;

import com.synergygb.panama.democda.models.db.TipoUsuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-20T11:08:29")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> uUser;
    public static volatile SingularAttribute<Usuarios, String> uPassword;
    public static volatile SingularAttribute<Usuarios, String> uName;
    public static volatile SingularAttribute<Usuarios, String> uEmail;
    public static volatile SingularAttribute<Usuarios, String> uuserUpdate;
    public static volatile SingularAttribute<Usuarios, String> uPhone;
    public static volatile SingularAttribute<Usuarios, String> uLastname;
    public static volatile SingularAttribute<Usuarios, Date> udateCreate;
    public static volatile SingularAttribute<Usuarios, Integer> uId;
    public static volatile SingularAttribute<Usuarios, Date> udateUpdate;
    public static volatile SingularAttribute<Usuarios, TipoUsuarios> uTipo;
    public static volatile SingularAttribute<Usuarios, String> uPicture;
    public static volatile SingularAttribute<Usuarios, String> uPermitology;
    public static volatile SingularAttribute<Usuarios, String> uuserCreate;

}