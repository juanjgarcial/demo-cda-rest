package com.synergygb.panama.democda.models.db;

import com.synergygb.panama.democda.models.db.RedesSociales;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-20T11:08:29")
@StaticMetamodel(Contactos.class)
public class Contactos_ { 

    public static volatile SingularAttribute<Contactos, String> cEmail;
    public static volatile SingularAttribute<Contactos, Float> caddressLatitude;
    public static volatile SingularAttribute<Contactos, Float> caddressLength;
    public static volatile SingularAttribute<Contactos, String> choursUntil;
    public static volatile CollectionAttribute<Contactos, RedesSociales> redesSocialesCollection;
    public static volatile SingularAttribute<Contactos, String> cuserCreate;
    public static volatile SingularAttribute<Contactos, Date> cdateUpdate;
    public static volatile SingularAttribute<Contactos, String> ctypeHours;
    public static volatile SingularAttribute<Contactos, String> cSubject;
    public static volatile SingularAttribute<Contactos, String> cAddress;
    public static volatile SingularAttribute<Contactos, String> cuserUpdate;
    public static volatile SingularAttribute<Contactos, String> choursFrom;
    public static volatile SingularAttribute<Contactos, String> cPhone;
    public static volatile SingularAttribute<Contactos, Integer> cId;
    public static volatile SingularAttribute<Contactos, Date> cdateCreate;

}