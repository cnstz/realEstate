package entities;
// Generated Sep 10, 2014 9:41:08 PM by Hibernate Tools 3.6.0



/**
 * PropertyPhotosId generated by hbm2java
 */
public class PropertyPhotosId  implements java.io.Serializable {


     private int photoId;
     private int propertyPropertyId;
     private int propertyOwnerUserId;

    public PropertyPhotosId() {
    }

    public PropertyPhotosId(int photoId, int propertyPropertyId, int propertyOwnerUserId) {
       this.photoId = photoId;
       this.propertyPropertyId = propertyPropertyId;
       this.propertyOwnerUserId = propertyOwnerUserId;
    }
   
    public int getPhotoId() {
        return this.photoId;
    }
    
    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
    public int getPropertyPropertyId() {
        return this.propertyPropertyId;
    }
    
    public void setPropertyPropertyId(int propertyPropertyId) {
        this.propertyPropertyId = propertyPropertyId;
    }
    public int getPropertyOwnerUserId() {
        return this.propertyOwnerUserId;
    }
    
    public void setPropertyOwnerUserId(int propertyOwnerUserId) {
        this.propertyOwnerUserId = propertyOwnerUserId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PropertyPhotosId) ) return false;
		 PropertyPhotosId castOther = ( PropertyPhotosId ) other; 
         
		 return (this.getPhotoId()==castOther.getPhotoId())
 && (this.getPropertyPropertyId()==castOther.getPropertyPropertyId())
 && (this.getPropertyOwnerUserId()==castOther.getPropertyOwnerUserId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPhotoId();
         result = 37 * result + this.getPropertyPropertyId();
         result = 37 * result + this.getPropertyOwnerUserId();
         return result;
   }   


}


