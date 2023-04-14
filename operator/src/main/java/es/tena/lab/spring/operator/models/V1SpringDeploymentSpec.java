/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


 package es.tena.lab.spring.operator.models;

 import java.util.Objects;
 import com.google.gson.annotations.SerializedName;
 import io.swagger.annotations.ApiModelProperty;
 
 /**
  * V1SpringDeploymentSpec
  */
 @javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-29T07:56:22.377Z[Etc/UTC]")
 public class V1SpringDeploymentSpec {
   public static final String SERIALIZED_NAME_IMAGE = "image";
   @SerializedName(SERIALIZED_NAME_IMAGE)
   private String image;
 
   public static final String SERIALIZED_NAME_NAME = "name";
   @SerializedName(SERIALIZED_NAME_NAME)
   private String name;
 
   public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
   @SerializedName(SERIALIZED_NAME_NAMESPACE)
   private String namespace;
 
   public static final String SERIALIZED_NAME_REPLICAS = "replicas";
   @SerializedName(SERIALIZED_NAME_REPLICAS)
   private Integer replicas;
 
 
   public V1SpringDeploymentSpec image(String image) {
     
     this.image = image;
     return this;
   }
 
    /**
    * Full name for the deployment image.
    * @return image
   **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "Full name for the deployment image.")
 
   public String getImage() {
     return image;
   }
 
 
   public void setImage(String image) {
     this.image = image;
   }
 
 
   public V1SpringDeploymentSpec name(String name) {
     
     this.name = name;
     return this;
   }
 
    /**
    * (Required) Name of the deployment.
    * @return name
   **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "(Required) Name of the deployment.")
 
   public String getName() {
     return name;
   }
 
 
   public void setName(String name) {
     this.name = name;
   }
 
 
   public V1SpringDeploymentSpec namespace(String namespace) {
     
     this.namespace = namespace;
     return this;
   }
 
    /**
    * Namespace to deploy app to. By default, this CR&#39;s namespace.
    * @return namespace
   **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "Namespace to deploy app to. By default, this CR's namespace.")
 
   public String getNamespace() {
     return namespace;
   }
 
 
   public void setNamespace(String namespace) {
     this.namespace = namespace;
   }
 
 
   public V1SpringDeploymentSpec replicas(Integer replicas) {
     
     this.replicas = replicas;
     return this;
   }
 
    /**
    * Number of replica pods.
    * @return replicas
   **/
   @javax.annotation.Nullable
   @ApiModelProperty(value = "Number of replica pods.")
 
   public Integer getReplicas() {
     return replicas;
   }
 
 
   public void setReplicas(Integer replicas) {
     this.replicas = replicas;
   }
 
 
   @Override
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (o == null || getClass() != o.getClass()) {
       return false;
     }
     V1SpringDeploymentSpec v1SpringDeploymentSpec = (V1SpringDeploymentSpec) o;
     return Objects.equals(this.image, v1SpringDeploymentSpec.image) &&
         Objects.equals(this.name, v1SpringDeploymentSpec.name) &&
         Objects.equals(this.namespace, v1SpringDeploymentSpec.namespace) &&
         Objects.equals(this.replicas, v1SpringDeploymentSpec.replicas);
   }
 
   @Override
   public int hashCode() {
     return Objects.hash(image, name, namespace, replicas);
   }
 
 
   @Override
   public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append("class V1SpringDeploymentSpec {\n");
     sb.append("    image: ").append(toIndentedString(image)).append("\n");
     sb.append("    name: ").append(toIndentedString(name)).append("\n");
     sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
     sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
     sb.append("}");
     return sb.toString();
   }
 
   /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
   private String toIndentedString(Object o) {
     if (o == null) {
       return "null";
     }
     return o.toString().replace("\n", "\n    ");
   }
 
 }
 