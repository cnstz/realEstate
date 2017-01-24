package entities;
// Generated Sep 10, 2014 9:41:08 PM by Hibernate Tools 3.6.0



/**
 * MessagesId generated by hbm2java
 */
public class MessagesId  implements java.io.Serializable {


     private int messageId;
     private int ownerUserId;
     private int propertyId;

    public MessagesId() {
    }

    public MessagesId(int messageId, int ownerUserId, int propertyId) {
       this.messageId = messageId;
       this.ownerUserId = ownerUserId;
       this.propertyId = propertyId;
    }
   
    public int getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
    public int getOwnerUserId() {
        return this.ownerUserId;
    }
    
    public void setOwnerUserId(int ownerUserId) {
        this.ownerUserId = ownerUserId;
    }
    public int getPropertyId() {
        return this.propertyId;
    }
    
    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MessagesId) ) return false;
		 MessagesId castOther = ( MessagesId ) other; 
         
		 return (this.getMessageId()==castOther.getMessageId())
 && (this.getOwnerUserId()==castOther.getOwnerUserId())
 && (this.getPropertyId()==castOther.getPropertyId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMessageId();
         result = 37 * result + this.getOwnerUserId();
         result = 37 * result + this.getPropertyId();
         return result;
   }   


}


