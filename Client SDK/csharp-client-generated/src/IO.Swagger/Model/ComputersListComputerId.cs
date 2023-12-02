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
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;
namespace IO.Swagger.Model
{
    /// <summary>
    /// ComputersListComputerId
    /// </summary>
    [DataContract]
        public partial class ComputersListComputerId :  IEquatable<ComputersListComputerId>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComputersListComputerId" /> class.
        /// </summary>
        /// <param name="accountinfo">accountinfo.</param>
        /// <param name="batteries">batteries.</param>
        /// <param name="bios">bios.</param>
        public ComputersListComputerId(List<ComputersListComputerIdAccountinfo> accountinfo = default(List<ComputersListComputerIdAccountinfo>), List<string> batteries = default(List<string>), List<ComputersListComputerIdBios> bios = default(List<ComputersListComputerIdBios>))
        {
            this.Accountinfo = accountinfo;
            this.Batteries = batteries;
            this.Bios = bios;
        }
        
        /// <summary>
        /// Gets or Sets Accountinfo
        /// </summary>
        [DataMember(Name="accountinfo", EmitDefaultValue=false)]
        public List<ComputersListComputerIdAccountinfo> Accountinfo { get; set; }

        /// <summary>
        /// Gets or Sets Batteries
        /// </summary>
        [DataMember(Name="batteries", EmitDefaultValue=false)]
        public List<string> Batteries { get; set; }

        /// <summary>
        /// Gets or Sets Bios
        /// </summary>
        [DataMember(Name="bios", EmitDefaultValue=false)]
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
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ComputersListComputerId);
        }

        /// <summary>
        /// Returns true if ComputersListComputerId instances are equal
        /// </summary>
        /// <param name="input">Instance of ComputersListComputerId to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComputersListComputerId input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Accountinfo == input.Accountinfo ||
                    this.Accountinfo != null &&
                    input.Accountinfo != null &&
                    this.Accountinfo.SequenceEqual(input.Accountinfo)
                ) && 
                (
                    this.Batteries == input.Batteries ||
                    this.Batteries != null &&
                    input.Batteries != null &&
                    this.Batteries.SequenceEqual(input.Batteries)
                ) && 
                (
                    this.Bios == input.Bios ||
                    this.Bios != null &&
                    input.Bios != null &&
                    this.Bios.SequenceEqual(input.Bios)
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
                int hashCode = 41;
                if (this.Accountinfo != null)
                    hashCode = hashCode * 59 + this.Accountinfo.GetHashCode();
                if (this.Batteries != null)
                    hashCode = hashCode * 59 + this.Batteries.GetHashCode();
                if (this.Bios != null)
                    hashCode = hashCode * 59 + this.Bios.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}