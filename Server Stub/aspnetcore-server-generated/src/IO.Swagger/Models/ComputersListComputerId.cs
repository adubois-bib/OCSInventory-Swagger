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
    public partial class ComputersListComputerId : IEquatable<ComputersListComputerId>
    { 
        /// <summary>
        /// Gets or Sets Accountinfo
        /// </summary>

        [DataMember(Name="accountinfo")]
        public List<ComputersListComputerIdAccountinfo> Accountinfo { get; set; }

        /// <summary>
        /// Gets or Sets Batteries
        /// </summary>

        [DataMember(Name="batteries")]
        public List<string> Batteries { get; set; }

        /// <summary>
        /// Gets or Sets Bios
        /// </summary>

        [DataMember(Name="bios")]
        public List<ComputersListComputerIdBios> Bios { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComputersListComputerId {\n");
            sb.Append("  Accountinfo: ").Append(Accountinfo).Append("\n");
            sb.Append("  Batteries: ").Append(Batteries).Append("\n");
            sb.Append("  Bios: ").Append(Bios).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComputersListComputerId)obj);
        }

        /// <summary>
        /// Returns true if ComputersListComputerId instances are equal
        /// </summary>
        /// <param name="other">Instance of ComputersListComputerId to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComputersListComputerId other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Accountinfo == other.Accountinfo ||
                    Accountinfo != null &&
                    Accountinfo.SequenceEqual(other.Accountinfo)
                ) && 
                (
                    Batteries == other.Batteries ||
                    Batteries != null &&
                    Batteries.SequenceEqual(other.Batteries)
                ) && 
                (
                    Bios == other.Bios ||
                    Bios != null &&
                    Bios.SequenceEqual(other.Bios)
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
                    if (Accountinfo != null)
                    hashCode = hashCode * 59 + Accountinfo.GetHashCode();
                    if (Batteries != null)
                    hashCode = hashCode * 59 + Batteries.GetHashCode();
                    if (Bios != null)
                    hashCode = hashCode * 59 + Bios.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComputersListComputerId left, ComputersListComputerId right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComputersListComputerId left, ComputersListComputerId right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
