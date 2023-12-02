/*
 * OCS Inventory Rest API
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Models
{
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class SNMPTypeInner : IEquatable<SNMPTypeInner>
    { 
        /// <summary>
        /// Gets or Sets ID
        /// </summary>

        [DataMember(Name="ID")]
        public int? ID { get; set; }

        /// <summary>
        /// Gets or Sets TABLE_TYPE_NAME
        /// </summary>

        [DataMember(Name="TABLE_TYPE_NAME")]
        public string TABLE_TYPE_NAME { get; set; }

        /// <summary>
        /// Gets or Sets TYPE_NAME
        /// </summary>

        [DataMember(Name="TYPE_NAME")]
        public string TYPE_NAME { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SNMPTypeInner {\n");
            sb.Append("  ID: ").Append(ID).Append("\n");
            sb.Append("  TABLE_TYPE_NAME: ").Append(TABLE_TYPE_NAME).Append("\n");
            sb.Append("  TYPE_NAME: ").Append(TYPE_NAME).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((SNMPTypeInner)obj);
        }

        /// <summary>
        /// Returns true if SNMPTypeInner instances are equal
        /// </summary>
        /// <param name="other">Instance of SNMPTypeInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SNMPTypeInner other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ID == other.ID ||
                    ID != null &&
                    ID.Equals(other.ID)
                ) && 
                (
                    TABLE_TYPE_NAME == other.TABLE_TYPE_NAME ||
                    TABLE_TYPE_NAME != null &&
                    TABLE_TYPE_NAME.Equals(other.TABLE_TYPE_NAME)
                ) && 
                (
                    TYPE_NAME == other.TYPE_NAME ||
                    TYPE_NAME != null &&
                    TYPE_NAME.Equals(other.TYPE_NAME)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (ID != null)
                    hashCode = hashCode * 59 + ID.GetHashCode();
                    if (TABLE_TYPE_NAME != null)
                    hashCode = hashCode * 59 + TABLE_TYPE_NAME.GetHashCode();
                    if (TYPE_NAME != null)
                    hashCode = hashCode * 59 + TYPE_NAME.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SNMPTypeInner left, SNMPTypeInner right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SNMPTypeInner left, SNMPTypeInner right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
