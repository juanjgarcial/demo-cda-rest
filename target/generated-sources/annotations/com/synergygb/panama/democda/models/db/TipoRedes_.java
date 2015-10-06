package com.synergygb.panama.democda.models.db;

import com.synergygb.panama.democda.models.db.RedesSociales;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-06T09:25:19")
@StaticMetamodel(TipoRedes.class)
public class TipoRedes_ { 

    public static volatile SingularAttribute<TipoRedes, String> trDescription;
    public static volatile CollectionAttribute<TipoRedes, RedesSociales> redesSocialesCollection;
    public static volatile SingularAttribute<TipoRedes, String> truserCreate;
    public static volatile SingularAttribute<TipoRedes, Date> trdateCreate;
    public static volatile SingularAttribute<TipoRedes, Date> trdateUpdate;
    public static volatile SingularAttribute<TipoRedes, Integer> trId;
    public static volatile SingularAttribute<TipoRedes, String> truserUpdate;

}