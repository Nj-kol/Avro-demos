/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.njkol.db.models;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Product extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Product\",\"namespace\":\"com.njkol.db.models\",\"fields\":[{\"name\":\"product_id\",\"type\":\"long\"},{\"name\":\"product_name\",\"type\":\"string\",\"doc\":\"This is the name of the product\"},{\"name\":\"product_description\",\"type\":[\"string\",\"null\"],\"order\":\"descending\"},{\"name\":\"product_status\",\"type\":{\"type\":\"enum\",\"name\":\"product_status\",\"symbols\":[\"AVAILABLE\",\"OUT_OF_STOCK\",\"ONLY_FEW_LEFT\"]},\"default\":\"AVAILABLE\"},{\"name\":\"product_category\",\"type\":\"string\",\"doc\":\"This is the name of the product category\",\"default\":null},{\"name\":\"price\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long product_id;
  /** This is the name of the product */
  @Deprecated public java.lang.CharSequence product_name;
  @Deprecated public java.lang.CharSequence product_description;
  @Deprecated public com.njkol.db.models.product_status product_status;
  /** This is the name of the product category */
  @Deprecated public java.lang.CharSequence product_category;
  @Deprecated public float price;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Product() {}

  /**
   * All-args constructor.
   */
  public Product(java.lang.Long product_id, java.lang.CharSequence product_name, java.lang.CharSequence product_description, com.njkol.db.models.product_status product_status, java.lang.CharSequence product_category, java.lang.Float price) {
    this.product_id = product_id;
    this.product_name = product_name;
    this.product_description = product_description;
    this.product_status = product_status;
    this.product_category = product_category;
    this.price = price;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return product_id;
    case 1: return product_name;
    case 2: return product_description;
    case 3: return product_status;
    case 4: return product_category;
    case 5: return price;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: product_id = (java.lang.Long)value$; break;
    case 1: product_name = (java.lang.CharSequence)value$; break;
    case 2: product_description = (java.lang.CharSequence)value$; break;
    case 3: product_status = (com.njkol.db.models.product_status)value$; break;
    case 4: product_category = (java.lang.CharSequence)value$; break;
    case 5: price = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'product_id' field.
   */
  public java.lang.Long getProductId() {
    return product_id;
  }

  /**
   * Sets the value of the 'product_id' field.
   * @param value the value to set.
   */
  public void setProductId(java.lang.Long value) {
    this.product_id = value;
  }

  /**
   * Gets the value of the 'product_name' field.
   * This is the name of the product   */
  public java.lang.CharSequence getProductName() {
    return product_name;
  }

  /**
   * Sets the value of the 'product_name' field.
   * This is the name of the product   * @param value the value to set.
   */
  public void setProductName(java.lang.CharSequence value) {
    this.product_name = value;
  }

  /**
   * Gets the value of the 'product_description' field.
   */
  public java.lang.CharSequence getProductDescription() {
    return product_description;
  }

  /**
   * Sets the value of the 'product_description' field.
   * @param value the value to set.
   */
  public void setProductDescription(java.lang.CharSequence value) {
    this.product_description = value;
  }

  /**
   * Gets the value of the 'product_status' field.
   */
  public com.njkol.db.models.product_status getProductStatus() {
    return product_status;
  }

  /**
   * Sets the value of the 'product_status' field.
   * @param value the value to set.
   */
  public void setProductStatus(com.njkol.db.models.product_status value) {
    this.product_status = value;
  }

  /**
   * Gets the value of the 'product_category' field.
   * This is the name of the product category   */
  public java.lang.CharSequence getProductCategory() {
    return product_category;
  }

  /**
   * Sets the value of the 'product_category' field.
   * This is the name of the product category   * @param value the value to set.
   */
  public void setProductCategory(java.lang.CharSequence value) {
    this.product_category = value;
  }

  /**
   * Gets the value of the 'price' field.
   */
  public java.lang.Float getPrice() {
    return price;
  }

  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.lang.Float value) {
    this.price = value;
  }

  /** Creates a new Product RecordBuilder */
  public static com.njkol.db.models.Product.Builder newBuilder() {
    return new com.njkol.db.models.Product.Builder();
  }
  
  /** Creates a new Product RecordBuilder by copying an existing Builder */
  public static com.njkol.db.models.Product.Builder newBuilder(com.njkol.db.models.Product.Builder other) {
    return new com.njkol.db.models.Product.Builder(other);
  }
  
  /** Creates a new Product RecordBuilder by copying an existing Product instance */
  public static com.njkol.db.models.Product.Builder newBuilder(com.njkol.db.models.Product other) {
    return new com.njkol.db.models.Product.Builder(other);
  }
  
  /**
   * RecordBuilder for Product instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Product>
    implements org.apache.avro.data.RecordBuilder<Product> {

    private long product_id;
    private java.lang.CharSequence product_name;
    private java.lang.CharSequence product_description;
    private com.njkol.db.models.product_status product_status;
    private java.lang.CharSequence product_category;
    private float price;

    /** Creates a new Builder */
    private Builder() {
      super(com.njkol.db.models.Product.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.njkol.db.models.Product.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.product_id)) {
        this.product_id = data().deepCopy(fields()[0].schema(), other.product_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.product_name)) {
        this.product_name = data().deepCopy(fields()[1].schema(), other.product_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.product_description)) {
        this.product_description = data().deepCopy(fields()[2].schema(), other.product_description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.product_status)) {
        this.product_status = data().deepCopy(fields()[3].schema(), other.product_status);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.product_category)) {
        this.product_category = data().deepCopy(fields()[4].schema(), other.product_category);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Product instance */
    private Builder(com.njkol.db.models.Product other) {
            super(com.njkol.db.models.Product.SCHEMA$);
      if (isValidValue(fields()[0], other.product_id)) {
        this.product_id = data().deepCopy(fields()[0].schema(), other.product_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.product_name)) {
        this.product_name = data().deepCopy(fields()[1].schema(), other.product_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.product_description)) {
        this.product_description = data().deepCopy(fields()[2].schema(), other.product_description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.product_status)) {
        this.product_status = data().deepCopy(fields()[3].schema(), other.product_status);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.product_category)) {
        this.product_category = data().deepCopy(fields()[4].schema(), other.product_category);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'product_id' field */
    public java.lang.Long getProductId() {
      return product_id;
    }
    
    /** Sets the value of the 'product_id' field */
    public com.njkol.db.models.Product.Builder setProductId(long value) {
      validate(fields()[0], value);
      this.product_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'product_id' field has been set */
    public boolean hasProductId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'product_id' field */
    public com.njkol.db.models.Product.Builder clearProductId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'product_name' field */
    public java.lang.CharSequence getProductName() {
      return product_name;
    }
    
    /** Sets the value of the 'product_name' field */
    public com.njkol.db.models.Product.Builder setProductName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.product_name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'product_name' field has been set */
    public boolean hasProductName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'product_name' field */
    public com.njkol.db.models.Product.Builder clearProductName() {
      product_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'product_description' field */
    public java.lang.CharSequence getProductDescription() {
      return product_description;
    }
    
    /** Sets the value of the 'product_description' field */
    public com.njkol.db.models.Product.Builder setProductDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.product_description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'product_description' field has been set */
    public boolean hasProductDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'product_description' field */
    public com.njkol.db.models.Product.Builder clearProductDescription() {
      product_description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'product_status' field */
    public com.njkol.db.models.product_status getProductStatus() {
      return product_status;
    }
    
    /** Sets the value of the 'product_status' field */
    public com.njkol.db.models.Product.Builder setProductStatus(com.njkol.db.models.product_status value) {
      validate(fields()[3], value);
      this.product_status = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'product_status' field has been set */
    public boolean hasProductStatus() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'product_status' field */
    public com.njkol.db.models.Product.Builder clearProductStatus() {
      product_status = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'product_category' field */
    public java.lang.CharSequence getProductCategory() {
      return product_category;
    }
    
    /** Sets the value of the 'product_category' field */
    public com.njkol.db.models.Product.Builder setProductCategory(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.product_category = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'product_category' field has been set */
    public boolean hasProductCategory() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'product_category' field */
    public com.njkol.db.models.Product.Builder clearProductCategory() {
      product_category = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'price' field */
    public java.lang.Float getPrice() {
      return price;
    }
    
    /** Sets the value of the 'price' field */
    public com.njkol.db.models.Product.Builder setPrice(float value) {
      validate(fields()[5], value);
      this.price = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'price' field has been set */
    public boolean hasPrice() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'price' field */
    public com.njkol.db.models.Product.Builder clearPrice() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Product build() {
      try {
        Product record = new Product();
        record.product_id = fieldSetFlags()[0] ? this.product_id : (java.lang.Long) defaultValue(fields()[0]);
        record.product_name = fieldSetFlags()[1] ? this.product_name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.product_description = fieldSetFlags()[2] ? this.product_description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.product_status = fieldSetFlags()[3] ? this.product_status : (com.njkol.db.models.product_status) defaultValue(fields()[3]);
        record.product_category = fieldSetFlags()[4] ? this.product_category : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.price = fieldSetFlags()[5] ? this.price : (java.lang.Float) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
