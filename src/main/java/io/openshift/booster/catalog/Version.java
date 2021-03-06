/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package io.openshift.booster.catalog;

/**
 *
 * @author <a href="mailto:tschotan@redhat.com">Tako Schotanus</a>
 */
public class Version implements Comparable<Version>
{
   private final String id;
   private final String name;

   public Version(String id)
   {
      this.id = id;
      this.name = id;
   }

   public Version(String id, String name)
   {
      this.id = id;
      this.name = name;
   }

   /**
    * This method is needed so the Web UI can know what's the internal ID used
    */
   public String getKey()
   {
      return getId();
   }

   /**
    * @return the id
    */
   public String getId()
   {
      return id;
   }

   /**
    * @return the name
    */
   public String getName()
   {
      return name;
   }

   @Override
   public int compareTo(Version o)
   {
      return getName().compareTo(o.getName());
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Version other = (Version) obj;
      if (id == null)
      {
         if (other.id != null)
            return false;
      }
      else if (!id.equals(other.id))
         return false;
      return true;
   }

   @Override
   public String toString()
   {
      return "Version [id=" + id + ", name=" + name + "]";
   }
}